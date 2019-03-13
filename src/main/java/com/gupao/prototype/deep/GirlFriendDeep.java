package com.gupao.prototype.deep;

import java.io.*;
import java.util.List;

//深克隆必须实现Serializable，否则不能序列化，不能转化为流
public class GirlFriendDeep implements Cloneable, Serializable {
    private String name;
    private List hobies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobies() {
        return hobies;
    }

    public void setHobies(List hobies) {
        this.hobies = hobies;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            GirlFriendDeep g = (GirlFriendDeep)ois.readObject();
            return g;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public GirlFriendDeep shallowColne() {
        GirlFriendDeep girlFriendNew = new GirlFriendDeep();
        girlFriendNew.name = this.name;
        girlFriendNew.hobies = this.hobies;
        return girlFriendNew;
    }
}

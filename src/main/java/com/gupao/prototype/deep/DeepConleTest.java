package com.gupao.prototype.deep;

import java.util.ArrayList;

public class DeepConleTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        GirlFriendDeep girlFriendDeep = new GirlFriendDeep();
        girlFriendDeep.setName("MM");
        ArrayList<String> list = new ArrayList<>();
        girlFriendDeep.setHobies(list);

        GirlFriendDeep clone = (GirlFriendDeep)girlFriendDeep.clone();
        GirlFriendDeep shallowColne = girlFriendDeep.shallowColne();

        //浅克隆只是把内存地址赋值，深克隆会把属性都new出来一份
        System.out.println(clone.getHobies() == girlFriendDeep.getHobies());
        System.out.println(shallowColne.getHobies() == girlFriendDeep.getHobies());
    }
}

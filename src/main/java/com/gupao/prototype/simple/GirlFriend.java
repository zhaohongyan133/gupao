package com.gupao.prototype.simple;

import com.gupao.prototype.Prototype;

import java.util.List;

public class GirlFriend implements Prototype {

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
    public Prototype clone() {
        GirlFriend girlFriendNew = new GirlFriend();
        girlFriendNew.name = this.name;
        girlFriendNew.hobies = this.hobies;
        return girlFriendNew;
    }
}

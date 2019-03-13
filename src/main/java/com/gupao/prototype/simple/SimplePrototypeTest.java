package com.gupao.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class SimplePrototypeTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setName("MM");
        List hobies = new ArrayList<>();
        girlFriend.setHobies(hobies);

        GirlFriend newGirlFriend = (GirlFriend)girlFriend.clone();

        //浅克隆，对象地址一致
        System.out.println(newGirlFriend.getHobies() == girlFriend.getHobies());
    }
}

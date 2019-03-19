package com.gupao.proxy.dynamic.jdkproxy;

import com.gupao.proxy.Person;

public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
    }
}

package com.gupao.proxy.staticproxy;

import com.gupao.proxy.Person;

public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("确认儿子需求");
        person.findLove();
        System.out.println("找对象");
    }

}

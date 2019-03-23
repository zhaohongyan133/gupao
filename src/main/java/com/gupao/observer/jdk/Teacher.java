package com.gupao.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("===========================");
        System.out.println(name + "老师：");
        System.out.println("您收到了来自" + question.getUser() + "的提问");
        System.out.println("内容为：");
        System.out.println(question.getContext());
        System.out.println("请及时解答");
        System.out.println("===========================");
    }
}

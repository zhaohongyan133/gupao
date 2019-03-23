package com.gupao.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.gupao.observer.jdk.Question;

public class GPGuavaEvent {

    private String name;

    public GPGuavaEvent(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println(name + "老师接收到消息提示：");
        System.out.println(question.getUser() + "同学，向您提出问题，内容为：");
        System.out.println(question.getContext());
    }
}

package com.gupao.observer.jdk;

import java.util.Observable;

public class GPer extends Observable {

    public void publishQuestion(Question question) {
        System.out.println(question.getUser() + "提出了一个问题");
        setChanged();
        notifyObservers(question);
    }
}

package com.gupao.observer.jdk;

public class ObserverTest {
    public static void main(String[] args) {
        Question question = new Question();
        question.setUser("zhaohy");
        question.setContext("观察者模式是什么？");

        GPer gPer = new GPer();
        gPer.addObserver(new Teacher("Tom"));
        gPer.publishQuestion(question);
    }
}

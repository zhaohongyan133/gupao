package com.gupao.observer.guava;

import com.google.common.eventbus.EventBus;
import com.gupao.observer.jdk.Question;

public class GPGuavaTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GPGuavaEvent event = new GPGuavaEvent("Tom");
        Question question = new Question();
        question.setUser("zhaohy");
        question.setContext("观察者模式有几种适用场景");
        event.subscribe(question);
        eventBus.register(event);
        eventBus.post(eventBus);
    }
}

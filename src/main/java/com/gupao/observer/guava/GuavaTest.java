package com.gupao.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new GuavaEvent());
        eventBus.post("Tom");
    }
}

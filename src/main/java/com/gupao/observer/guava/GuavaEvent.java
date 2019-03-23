package com.gupao.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行业务逻辑，传入的参数是：" + str);
    }

}

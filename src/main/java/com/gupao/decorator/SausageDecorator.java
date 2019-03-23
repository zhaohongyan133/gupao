package com.gupao.decorator;

public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 3;
    }
}

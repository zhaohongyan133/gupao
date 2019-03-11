package com.gupao.singleton.lazy;

public class LazySingleton3 {
    private static LazySingleton3 lazySingleton = null;

    private LazySingleton3() {}

    public static LazySingleton3 getInstance() {
        //这种方法在执行到此步骤时，如果多个线程同时调用会同时进入synchronized，顺序执行解锁都会调用new方法，这样易燃可能导致有多个对象被创建
        if (lazySingleton == null) {
            synchronized (LazySingleton3.class) {
                lazySingleton = new LazySingleton3();
            }
        }
        return lazySingleton;
    }
}

package com.gupao.singleton.lazy;

public class LazySingleton2 {
    private static LazySingleton2 lazySingleton = null;

    private LazySingleton2() {}

    //此种方法直接将方法加锁，效率太低
    public static synchronized LazySingleton2 getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton2();
        }
        return lazySingleton;
    }
}

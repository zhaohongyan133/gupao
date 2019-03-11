package com.gupao.singleton.lazy;

public class LazySingleton1 {
    private static LazySingleton1 lazySingleton = null;

    private LazySingleton1() {}

    public static LazySingleton1 getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton1();
        }
        return lazySingleton;
    }
}

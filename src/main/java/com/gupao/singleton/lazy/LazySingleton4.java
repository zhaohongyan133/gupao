package com.gupao.singleton.lazy;

public class LazySingleton4 {
    private static LazySingleton4 lazySingleton = null;

    private LazySingleton4() {}

    public static LazySingleton4 getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton4.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton4();
                }
            }
        }
        return lazySingleton;
    }
}

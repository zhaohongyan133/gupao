package com.gopao.singleton.lazy;

import com.gupao.singleton.lazy.LazySingleton1;

public class LazyExecutor implements Runnable{
    public void run() {
        LazySingleton1 instance = LazySingleton1.getInstance();
        System.out.println(instance);
    }
}

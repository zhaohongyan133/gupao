package com.gopao.singleton.lazy;

public class LazySingleton1Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyExecutor());
        Thread thread2 = new Thread(new LazyExecutor());

        thread1.start();
        thread2.start();
        System.out.println("end");
    }
}

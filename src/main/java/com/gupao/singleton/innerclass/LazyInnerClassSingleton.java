package com.gupao.singleton.innerclass;

//兼顾饿汉式浪费内存空间，懒汉式synchronized性能问题的解决方法
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    //static为了对象空间共享
    //final是为了保证方法不被重写
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}

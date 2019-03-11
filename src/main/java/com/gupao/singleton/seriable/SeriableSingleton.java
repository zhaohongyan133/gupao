package com.gupao.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    //添加readResolve方法防止序列化破坏单例
    //这种方法虽然返回的结果是两个同样的对象，但是对象还是被创建了的，是否还有其他的创建方式：注册时单例
//    private Object readResolve() {
//        return INSTANCE;
//    }
}

package com.gopao.singleton.innerclass;

import com.gupao.singleton.innerclass.LazyInnerClassSingletonFinal;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) throws Exception{
//        Class<?> clazz = LazyInnerClassSingleton.class;
        Class<?> clazz = LazyInnerClassSingletonFinal.class;

        //获取私有构造方法
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);

        //设置访问权限为true（强吻）
        constructor.setAccessible(true);

        //暴力初始化
        Object o1 = constructor.newInstance();

        //调用两次构造方法，但是创建的对象不一致，单例被打破
        Object o2 = constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }
}

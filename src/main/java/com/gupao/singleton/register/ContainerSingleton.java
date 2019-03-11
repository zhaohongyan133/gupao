package com.gupao.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//便于管理但是非线程安全
public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {}

    public static Object getBear(String className) {
        synchronized(ioc) {
            if (!ioc.containsKey(className)) {
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            } else {
                return ioc.get(className);
            }
        }
    }
}

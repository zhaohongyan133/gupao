package com.gupao.proxy.order;

public class DynamicDataSourceEntry {
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntry(){}

    public static void set(String source) {
        local.set(source);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }
}

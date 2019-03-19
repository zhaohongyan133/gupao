package com.gupao.proxy.mybusiness.sqlsearch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKSqlSearchProxy implements InvocationHandler {

    private ISQLSearch search;

    public Object getInstance(ISQLSearch search) {
        this.search = search;
        Class<?> clazz = search.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(search, args);
    }
}

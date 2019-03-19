package com.gupao.delegate;

public class MysqlSearch implements ISearch {
    @Override
    public void query(String sql) {
        System.out.println("Mysql : " + sql);
    }
}

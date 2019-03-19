package com.gupao.strategy;

public class MysqlSearch implements ISearch {
    @Override
    public void query(String sql) {
        System.out.println("Mysql : " + sql);
    }
}

package com.gupao.strategy;

public class OracleSearch implements ISearch {
    @Override
    public void query(String sql) {
        System.out.println("Oracle : " + sql);
    }
}

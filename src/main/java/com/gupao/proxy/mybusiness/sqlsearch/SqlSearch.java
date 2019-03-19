package com.gupao.proxy.mybusiness.sqlsearch;

public class SqlSearch implements ISQLSearch {
    @Override
    public void search(String sql) {
        System.out.println(sql);
    }
}

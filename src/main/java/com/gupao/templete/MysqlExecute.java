package com.gupao.templete;

import java.util.Map;

public class MysqlExecute extends SqlExecuteTemplete {
    @Override
    protected void execute(String sql) {
        System.out.println(sql);
    }

    @Override
    protected String sqlFormat(String sql) {
        System.out.println("不同数据库SQL有差异，根据需求重写SQL");
        return sql;
    }

    @Override
    protected String getSql(Map<String, String> param) {
        System.out.println("组装sql");
        String s = String.format("select * from %s", param.get("table"));
        return s;
    }
}

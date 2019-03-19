package com.gupao.templete;

import java.util.Map;

public abstract class SqlExecuteTemplete {
    protected void executeSql(Map<String, String> param) {
        String sql = this.getSql(param);
        String newSql = sqlFormat(sql);
        execute(sql);
    }

    protected abstract void execute(String sql);

    protected abstract String sqlFormat(String sql);

    protected abstract String getSql(Map<String, String> param);
}

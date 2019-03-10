package com.gupao.factory;

public class MysqlVendor implements IVendor {

    public String getSQL(String sql) {
        sql = "mysql : " + sql;
        return sql;
    }
}

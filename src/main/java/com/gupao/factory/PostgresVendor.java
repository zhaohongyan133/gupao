package com.gupao.factory;

public class PostgresVendor implements IVendor {
    public String getSQL(String sql) {
        sql = "postgres : " + sql;
        return sql;
    }
}

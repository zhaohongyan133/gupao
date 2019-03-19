package com.gupao.adapter;

public class OracleExecuteAdapter implements IOracleExecute{

    private MysqlExecute mysqlExecute;

    public OracleExecuteAdapter(MysqlExecute mysqlExecute) {
        this.mysqlExecute = mysqlExecute;
    }

    @Override
    public String getSql(String sql) {
        String oracleSql = mysqlExecute.getSql(sql).replace("Mysql", "Oracle");
        System.out.println(oracleSql);
        return oracleSql;
    }
}

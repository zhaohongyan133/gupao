package com.gupao.adapter;

public class OracleAdapterTest {
    public static void main(String[] args) {
        OracleExecuteAdapter adapter = new OracleExecuteAdapter(new MysqlExecute());
        adapter.getSql("select * from student");
    }
}

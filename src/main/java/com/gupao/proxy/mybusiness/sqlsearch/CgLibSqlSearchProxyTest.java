package com.gupao.proxy.mybusiness.sqlsearch;

public class CgLibSqlSearchProxyTest {
    public static void main(String[] args) {
        SqlSearch instance = (SqlSearch)new CgLibSqlSearchProxy().getInstance(new SqlSearch().getClass());
        instance.search("select * from student");
    }
}

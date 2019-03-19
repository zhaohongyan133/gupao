package com.gupao.proxy.mybusiness.sqlsearch;

public class JDKSqlSearchProxyTest {
    public static void main(String[] args) {
        ISQLSearch instance = (ISQLSearch)new JDKSqlSearchProxy().getInstance(new SqlSearch());
        instance.search("select * from student");
    }
}

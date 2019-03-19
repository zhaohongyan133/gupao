package com.gupao.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        String type = "mysql";
        ISearch search = null;
        if ("mysql".equals(type) ) {
            search = new MysqlSearch();
        } else if ("oracle".equals(type)) {
            search = new OracleSearch();
        } else {
            System.out.println("无此方法");
            return;
        }
        search.query("select * from student");

    }
}

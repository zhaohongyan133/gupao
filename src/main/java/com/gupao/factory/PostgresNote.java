package com.gupao.factory;

public class PostgresNote implements INote {
    public void record() {
        System.out.println("给Postgres添加注释");
    }
}

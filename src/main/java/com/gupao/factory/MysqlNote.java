package com.gupao.factory;

public class MysqlNote implements INote {
    public void record() {
        System.out.println("给Mysql添加注释");
    }
}

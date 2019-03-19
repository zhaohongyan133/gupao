package com.gupao.templete;

import java.util.HashMap;

public class MysqlExecuteTest {
    public static void main(String[] args) {
        MysqlExecute execute = new MysqlExecute();
        HashMap<String, String> map = new HashMap<>();
        map.put("table", "student");
        execute.executeSql(map);
    }
}

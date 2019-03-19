package com.gupao.delegate;

import java.util.HashMap;
import java.util.Map;

public class SearchDelegate {
    private static Map<String, ISearch> searchMap = new HashMap<>();

    static {
        searchMap.put("mysql", new MysqlSearch());
        searchMap.put("oracle", new OracleSearch());
    }

    public void query(String type, String sql) {
        searchMap.get(type).query(sql);
    }
}

package com.gupao.delegate;

public class SearchDelegateTest {
    public static void main(String[] args) {
        SearchDelegate searchDelegate = new SearchDelegate();
        searchDelegate.query("mysql", "select * from student");
        searchDelegate.query("oracle", "select * from student");
    }
}

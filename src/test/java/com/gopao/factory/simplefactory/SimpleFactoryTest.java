package com.gopao.factory.simplefactory;

import com.gupao.factory.IVendor;
import com.gupao.factory.simplefactory.VendorFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        IVendor mysql = VendorFactory.createVendor("mysql");
        IVendor postgres = VendorFactory.createVendor("postgres");

        System.out.println(mysql.getSQL("select * from student"));
        System.out.println(postgres.getSQL("select * from student"));

    }
}

package com.gopao.factory.factoryfunc;

import com.gupao.factory.IVendor;
import com.gupao.factory.IVendorFactory;
import com.gupao.factory.factoryfunc.MysqlVendorFactory;
import com.gupao.factory.factoryfunc.PostgresVendorFactory;

public class FactoryFuncTest {
    public static void main(String[] args) {
        IVendorFactory mysqlVendorFactory = new MysqlVendorFactory();
        IVendor mysqlVendor = mysqlVendorFactory.createVendor();

        IVendorFactory postgresVendorFactory = new PostgresVendorFactory();
        IVendor postgresVendor= postgresVendorFactory.createVendor();

        System.out.println(mysqlVendor.getSQL("select * from student"));
        System.out.println(postgresVendor.getSQL("select * from student"));
    }
}

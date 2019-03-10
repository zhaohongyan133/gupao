package com.gopao.factory.abstractfactory;

import com.gupao.factory.INote;
import com.gupao.factory.IVendor;
import com.gupao.factory.abstractfactory.AbstractFactory;
import com.gupao.factory.abstractfactory.MysqlFactory;
import com.gupao.factory.abstractfactory.PostgresFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory mysqlFactory = new MysqlFactory();
        AbstractFactory postgresFactory = new PostgresFactory();
        INote mysqlFactoryNote = mysqlFactory.createNote();
        IVendor mysqlFactoryVendor = mysqlFactory.createVendor();

        INote postgresFactoryNote = postgresFactory.createNote();
        IVendor postgresFactoryVendor = postgresFactory.createVendor();

        mysqlFactoryNote.record();
        System.out.println(mysqlFactoryVendor.getSQL("select * from student"));

        postgresFactoryNote.record();
        System.out.println(postgresFactoryVendor.getSQL("select * from student"));
    }
}

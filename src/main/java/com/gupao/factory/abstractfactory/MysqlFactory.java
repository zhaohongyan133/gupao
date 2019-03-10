package com.gupao.factory.abstractfactory;

import com.gupao.factory.INote;
import com.gupao.factory.IVendor;
import com.gupao.factory.MysqlNote;
import com.gupao.factory.MysqlVendor;

public class MysqlFactory implements AbstractFactory {
    public IVendor createVendor() {
        return new MysqlVendor();
    }

    public INote createNote() {
        return new MysqlNote();
    }
}

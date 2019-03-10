package com.gupao.factory.abstractfactory;

import com.gupao.factory.INote;
import com.gupao.factory.IVendor;
import com.gupao.factory.PostgresNote;
import com.gupao.factory.PostgresVendor;

public class PostgresFactory implements AbstractFactory{
    public IVendor createVendor() {
        return new PostgresVendor();
    }

    public INote createNote() {
        return new PostgresNote();
    }
}

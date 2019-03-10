package com.gupao.factory.abstractfactory;

import com.gupao.factory.INote;
import com.gupao.factory.IVendor;

public interface AbstractFactory {
    IVendor createVendor();

    INote createNote();
}

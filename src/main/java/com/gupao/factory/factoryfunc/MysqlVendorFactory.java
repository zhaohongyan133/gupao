package com.gupao.factory.factoryfunc;

import com.gupao.factory.IVendor;
import com.gupao.factory.IVendorFactory;
import com.gupao.factory.MysqlVendor;

public class MysqlVendorFactory implements IVendorFactory {
    public IVendor createVendor() {
        return new MysqlVendor();
    }

}

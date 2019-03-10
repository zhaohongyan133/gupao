package com.gupao.factory.factoryfunc;

import com.gupao.factory.IVendor;
import com.gupao.factory.IVendorFactory;
import com.gupao.factory.PostgresVendor;

public class PostgresVendorFactory implements IVendorFactory {
    public IVendor createVendor() {
        return new PostgresVendor();
    }
}

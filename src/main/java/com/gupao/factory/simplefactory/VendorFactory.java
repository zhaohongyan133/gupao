package com.gupao.factory.simplefactory;

import com.gupao.factory.IVendor;
import com.gupao.factory.MysqlVendor;
import com.gupao.factory.PostgresVendor;

public class VendorFactory {
    public static IVendor createVendor(String s) {
        if ("mysql".equals(s)) {
            return new MysqlVendor();
        } else if ("postgres".equals(s)) {
            return new PostgresVendor();
        } else {
            return null;
        }
    }
}

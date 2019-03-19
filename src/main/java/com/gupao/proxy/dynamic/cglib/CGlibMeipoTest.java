package com.gupao.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class CGlibMeipoTest {
    public static void main(String[] args) {
        //利用cglib类中的代理类可以将内存中的class文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "G://cglib_class_target/");
        Girl girl = (Girl)new CGlibMeipo().getInstance(Girl.class);
        girl.findLove();
    }
}

package com.gupao.proxy.dynamic.jdkproxy;

import com.gupao.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKMeipoTest {
    public static void main(String[] args) {
        JDKMeipo jdkMeipo = new JDKMeipo();
        Person person = (Person)jdkMeipo.getInstance(new Customer());
        person.findLove();

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fos= new FileOutputStream("G://$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

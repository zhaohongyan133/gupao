package com.gopao.singleton.hungry;

import com.gupao.singleton.hungry.HungrySingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton3 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton4 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton5 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton6 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);
        System.out.println(hungrySingleton3);
        System.out.println(hungrySingleton4);
        System.out.println(hungrySingleton5);
        System.out.println(hungrySingleton6);
    }
}

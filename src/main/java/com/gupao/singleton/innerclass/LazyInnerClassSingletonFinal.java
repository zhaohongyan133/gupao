package com.gupao.singleton.innerclass;

public class LazyInnerClassSingletonFinal {
    private LazyInnerClassSingletonFinal() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static final LazyInnerClassSingletonFinal getInstance() {
        return LazyHolder.LAZY;
    }

    private static final class LazyHolder {
        private static final LazyInnerClassSingletonFinal LAZY = new LazyInnerClassSingletonFinal();
    }
}

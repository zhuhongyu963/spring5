package com.jpa.utils;

public class SimpleSingleton {

    // 私有的构造方法
    private SimpleSingleton() {

    }

//    // 1.饿汉模型
//    // 持有自己类的引用
//    private static final SimpleSingleton INSTANCE = new SimpleSingleton();
//
//    // 获取实例的静态方法
//    public static SimpleSingleton getInstance() {
//        return INSTANCE;
//    }

//    // 2.双重检查模型
//    // 持有自己类的引用
//    private volatile static SimpleSingleton INSTANCE;
//
//    // 获取实例的静态方法
//    public static SimpleSingleton getInstance() {
//        if (INSTANCE == null) {
//            synchronized (SimpleSingleton.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new SimpleSingleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    // 3.静态内部类模式
    private static class Inner {
        private static final SimpleSingleton INSTANCE = new SimpleSingleton();
    }

    public static SimpleSingleton getInstance() {
        return Inner.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(SimpleSingleton.getInstance().hashCode());
        System.out.println(SimpleSingleton.getInstance().hashCode());
    }
}

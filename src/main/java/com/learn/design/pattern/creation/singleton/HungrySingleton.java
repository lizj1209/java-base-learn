package com.learn.design.pattern.creation.singleton;

/**
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void check() {
        System.out.println("hungry create singleton object: " + this.hashCode());
    }
}

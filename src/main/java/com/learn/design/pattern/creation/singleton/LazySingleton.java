package com.learn.design.pattern.creation.singleton;

import java.util.Objects;

/**
 * 懒汉式单例
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 *
 * 每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void check() {
        System.out.println("lazy create singleton object: " + this.hashCode());
    }
}

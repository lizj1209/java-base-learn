package com.learn.design.pattern.creation.singleton;

/**
 * 静态内部类实现单例
 *
 * 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以jvm保证了线程的安全
 * 在类进行初始化时，别的线程是无法进入的
 */
public class StaticSingleton {

    private StaticSingleton() {}

    private static class SingletonInstance {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public void check() {
        System.out.println("static create singleton object: " + this.hashCode());
    }
}

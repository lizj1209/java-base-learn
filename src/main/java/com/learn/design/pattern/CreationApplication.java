package com.learn.design.pattern;

import com.learn.design.pattern.creation.singleton.EnumSingleton;
import com.learn.design.pattern.creation.singleton.HungrySingleton;
import com.learn.design.pattern.creation.singleton.LazySingleton;
import com.learn.design.pattern.creation.singleton.StaticSingleton;

/**
 * 创建型模式的主要关注点是“怎样创建对象？”，
 * 它的主要特点是“将对象的创建与使用分离”。
 * 这样可以降低系统的耦合度，使用者不需要关注对象的创建细节，对象的创建由相关的工厂来完成。
 * 就像我们去商场购买商品时，不需要知道商品是怎么生产出来一样，因为它们由专门的厂商生产。
 *
 * 创建型模式分为以下几种。
 * 单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
 * 原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
 * 工厂方法（FactoryMethod）模式：定义一个用于创建产品的接口，由子类决定生产什么产品。
 * 抽象工厂（AbstractFactory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
 * 建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
 */
public class CreationApplication {

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.check();
        HungrySingleton.getInstance().check();
        LazySingleton.getInstance().check();
        StaticSingleton.getInstance().check();
    }
}

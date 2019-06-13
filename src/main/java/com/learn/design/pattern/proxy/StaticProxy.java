package com.learn.design.pattern.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 静态代理模式
 * @author  lizj
 * Date: 2019/6/13
 */
public interface StaticProxy {

    /**
     *  定义方法
     */
    void doSomething();

    /**
     * 实现对象
     */
    class AchieveObject implements StaticProxy{

        @Override
        public void doSomething() {
            System.out.println("Achieve StaticProxy");
        }
    }

    /**
     * 代理对象
     */
    @AllArgsConstructor
    class ProxyObject implements StaticProxy{

        private AchieveObject achieveObject;

        @Override
        public void doSomething() {
            System.out.println("Achieve StaticProxy before");
            achieveObject.doSomething();
            System.out.println("Achieve StaticProxy after");
        }
    }
}

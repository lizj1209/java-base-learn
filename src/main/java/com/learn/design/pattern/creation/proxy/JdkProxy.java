package com.learn.design.pattern.creation.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理模式
 * @author lizj
 * Date: 2019/6/13
 */
public interface JdkProxy {

    /**
     * 定义方法
     */
    void doSomething();

    /**
     * 实现对象
     */
    class AchieveObject implements JdkProxy{

        @Override
        public void doSomething() {
            System.out.println("Achieve JdkProxy");
        }
    }

    /**
     * jdk动态代理对象
     */
    class ProxyObject implements InvocationHandler {

        private Object targetObj;

        public Object newProxyObject(Object targetObj){
            this.targetObj = targetObj;
            return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(), targetObj.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Achieve JdkProxy before");
            Object obj = method.invoke(targetObj, args);
            System.out.println("Achieve JdkProxy after");
            return obj;
        }
    }
}

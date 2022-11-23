package com.learn.design.pattern.creation.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 * @author lizj
 * Date: 2019/6/13
 */
public class CglibProxy implements MethodInterceptor{

    private Object targetObject;

    public Object newProxyObject(Object targetObject){
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("do something before");
        Object result = methodProxy.invoke(targetObject, objects);
        System.out.println("do something after");
        return result;
    }
}
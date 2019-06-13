package com.learn.design.pattern;

import com.learn.design.pattern.proxy.CglibObject;
import com.learn.design.pattern.proxy.CglibProxy;
import com.learn.design.pattern.proxy.JdkProxy;
import com.learn.design.pattern.proxy.StaticProxy;
import org.junit.Test;

/**
 * @author lizj
 * Date: 2019/6/13
 */
public class ProxyTest {

    @Test
    public void staticProxyTest() {
        StaticProxy proxy = new StaticProxy.ProxyObject(new StaticProxy.AchieveObject());
        proxy.doSomething();
    }

    @Test
    public void jdkProxyTest(){
        JdkProxy proxy = (JdkProxy) new JdkProxy.ProxyObject().newProxyObject(new JdkProxy.AchieveObject());
        proxy.doSomething();
    }

    @Test
    public void cglibProxyTest(){
        CglibObject object = (CglibObject) new CglibProxy().newProxyObject(new CglibObject());
        object.doSomething();
    }

}
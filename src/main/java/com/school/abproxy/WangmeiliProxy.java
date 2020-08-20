package com.school.abproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chengjinging
 * @date 2020/8/18 上午7:37
 */
public class WangmeiliProxy implements InvocationHandler {
    private Girl girl;


    public WangmeiliProxy(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomeThingBefore();
        Object obj=method.invoke(girl,args);
        doSomeThingAfter();
        return obj;
    }

    public void doSomeThingBefore(){
        System.out.println("调查背景");

    }

    public void doSomeThingAfter(){
        System.out.println("有没有对你做什么？");
    }


    public Object getProxyInstance(){
        return Proxy.newProxyInstance(this.girl.getClass().getClassLoader(),this.girl.getClass().getInterfaces(),this);
    }


}

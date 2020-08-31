package com.school.abReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chengjinging
 * @date 2020/8/20 下午11:39
 */
public class SaleBusiness implements InvocationHandler {

    private FactoryClass factoryClass;

    public SaleBusiness(FactoryClass factoryClass) {
        this.factoryClass = factoryClass;
    }

    public SaleBusiness() {

    }

    public void setFactoryClass(FactoryClass factoryClass) {
        this.factoryClass = factoryClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("提供了售前服务");
        Object object=method.invoke(factoryClass,args);
        System.out.println("提供了守候服务");

        return object;
    }



    public Object  getInstance(){
        return Proxy.newProxyInstance(
                this.factoryClass.getClass().getClassLoader(),
                this.factoryClass.getClass().getInterfaces(),
                this);
    }






}

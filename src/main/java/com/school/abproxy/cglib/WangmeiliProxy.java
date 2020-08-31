package com.school.abproxy.cglib;

import com.school.abproxy.Girl;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chengjinging
 * @date 2020/8/18 上午7:37
 */
public class WangmeiliProxy  {






    public void doSomeThingBefore(){
        System.out.println("调查背景");

    }

    public void doSomeThingAfter(){
        System.out.println("有没有对你做什么？");
    }


    public static void main(final String[] args) {
         Wangmeili wangmeili=new Wangmeili();
        Wangmeili wangmeili2= (Wangmeili) Enhancer.create(wangmeili.getClass(), new MethodInterceptor() {
//            wangmeili
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("调查背景");
                Object obj=method.invoke(wangmeili,args);
                System.out.println("有没有对你做什么？");

                return obj;
            }
        });
        wangmeili2.say();


    }


}

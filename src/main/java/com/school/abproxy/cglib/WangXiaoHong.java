package com.school.abproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chengjinging
 * @date 2020/8/21 下午2:50
 */
public class WangXiaoHong {



    public void eat(){
        System.out.println("吃大餐。。");
    }
    public void parkVisit(){
        System.out.println("逛公园。。");
    }

    public void gotoCity(String cityName){
        System.out.println("我要去"+cityName+"....");
    }

    public static void main(String[] args) {
        final WangXiaoHong wangXiaoHong=new WangXiaoHong();
        WangXiaoHong proxy= (WangXiaoHong) Enhancer.create(wangXiaoHong.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object obj=null;
                if ("gotoCity".equals(method.getName())){
                    System.out.println("准备去那里玩耍");
                    obj=method.invoke(wangXiaoHong,args);
                    System.out.println("这次玩的开心吗");

                }else {
                    System.out.println("调查一下他的背景");
                    obj=method.invoke(wangXiaoHong,args);
                    System.out.println("有没有对你动手动脚？");
                }

                return obj;
            }
        });

        proxy.eat();
        proxy.parkVisit();
        proxy.gotoCity("上海");

    }



}

package com.school.abReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chengjinging
 * @date 2020/8/19 下午11:38
 */
public class Demo3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Cat cat=new Cat();
        Class catCls=Cat.class;                 //方法名    参数类型.class
        Method eatMethod=catCls.getMethod("eat",    String.class);
        eatMethod.invoke(cat,"鱼干");
        Method methodWork=catCls.getMethod("work");
        methodWork.invoke(cat);
    }
}

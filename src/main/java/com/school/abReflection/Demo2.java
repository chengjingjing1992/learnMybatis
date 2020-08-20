package com.school.abReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author chengjinging
 * @date 2020/8/19 下午11:23
 */
public class Demo2 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class catClass=Cat.class;

        Constructor constructor=Cat.class.getConstructor(String.class);
        Object cat=constructor.newInstance("咖啡猫");
        System.out.println(cat.toString());





    }
}

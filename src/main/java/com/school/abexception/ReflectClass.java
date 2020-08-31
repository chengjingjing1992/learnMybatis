package com.school.abexception;

import com.school.abReflection.Cat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author chengjinging
 * @date 2020/8/20 下午9:35
 *
 *
 * 不改动这个类的任何内容 获取对象的任何变量 任何方法
 */
public class ReflectClass {


    public Properties getProperties(){
        Properties properties=new Properties();
        BufferedReader bufferedReader= null;
        try {

            bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/resources/myclass.properties"));
            properties.load(bufferedReader);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

    public Object getObject(){
        try {
            return getObjClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }



    public  Class getObjClass(){

        String fullClassName=getProperties().getProperty("className");
        try {
            return Class.forName(fullClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ReflectClass reflectClass=new ReflectClass();


        Cat cat= (Cat) reflectClass.getObject();
//        System.out.println();
        reflectClass.executeObjMethod(cat);
    }

    public void executeObjMethod(Object obj){
        try {
            String methonName=getProperties().getProperty("methodName");
            Method method=getObjClass().getDeclaredMethod(methonName);
            method.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }





}

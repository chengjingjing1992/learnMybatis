package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/9/13 上午11:21
 */
public class SpringSystemDemo1 {


    public static void main(String[] args) {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("bean.xml");
        /**演示spring实例化bean的三种方法之非静态工厂方法
         */
        Teacher teacher= (Teacher) applicationContext.getBean("teacher");
        teacher.setName("张三");
        teacher.setProject("语文");
        System.out.println("**********演示spring实例化bean的三种方法之非静态工厂方法**********");

        System.out.println(teacher.toString());

        /**
         * 演示spring实例化bean的三种方法之[静态工厂方法]
         */

        City capitalCity= (City) applicationContext.getBean("capitalCity");
        System.out.println(capitalCity.toString());

        /**
         * 演示通过构造函数 实例化bean
         */
        Person person=(Person)applicationContext.getBean("person");
        System.out.println("**********演示通过构造函数 实例化bean**********");
        System.out.println(person);


    }
}

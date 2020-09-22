package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/9/13 上午11:21
 */
public class SpringSystemDemo3 {


    public static void main(String[] args) {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("**********Spring 装配Bean 之 基于注解 **********");

        DemoController controller= (DemoController) applicationContext.getBean("demoController");
        controller.contollerDemo();













    }
}

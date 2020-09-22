package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/9/13 上午11:21
 */
public class SpringSystemDemo2 {


    public static void main(String[] args) {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("**********Spring基于XML装配Bean 之set方法注入 属性值 **********");

        Worker xiaoming= (Worker) applicationContext.getBean("worker");
        System.out.println(xiaoming.toString());

        System.out.println("**********Spring基于XML装配Bean 之构造函数注入 属性值 **********");

        Boss wangjianlin= (Boss) applicationContext.getBean("boss");
        System.out.println(wangjianlin.toString());

        System.out.println("**********Spring基于XML装配Bean之 构造函数注入对象 **********");
        Staff staff= (Staff) applicationContext.getBean("staff");
        staff.getDept();



        System.out.println("**********Spring基于XML装配Bean之set方法注入对象 **********");
        Leader leader= (Leader)applicationContext.getBean("leader");
        leader.getLeaderDept();











    }
}

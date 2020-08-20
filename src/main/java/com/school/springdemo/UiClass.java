package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/8/15 上午10:38
 *
 *模仿视图层
 */
public class UiClass {

    public static void main(String[] args) {

//        AccountService accountService=new AccountService();
//        accountService.saveMoney();

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
//        AccountService accountService= (AccountService) applicationContext.getBean("AccountService");
//        AccountService ac= (AccountService) applicationContext.getBean("AccountService");


        AccountService accountService= (AccountService) applicationContext.getBean("AccountService");
        AccountService AccountServiceStatic= (AccountService) applicationContext.getBean("AccountServiceStatic");


        System.out.println( accountService);
        System.out.println(AccountServiceStatic);


    }
}

package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/8/15 下午9:15
 */
public class UiClass2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        BankServiceImplBeijing bankServiceImplBeijing= (BankServiceImplBeijing) applicationContext.getBean("BankServiceImplBeijing");
        System.out.println(bankServiceImplBeijing.getSet().toString());
        System.out.println(bankServiceImplBeijing.getList().toString());

    }
}

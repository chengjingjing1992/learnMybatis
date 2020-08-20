package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengjinging
 * @date 2020/8/16 上午12:00
 */
public class UIClass3 {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        Cart cart= (Cart) ac.getBean("cart");
        System.out.println(cart.toString());

    }
}

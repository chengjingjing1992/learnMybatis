package com.school.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/8/15 下午8:08
 */
public class UiClass1 {

    /**
     * 通过set方法进行注入依赖
     * private int bankNo;
     *     private String bankName;
     *     private Date date;
     *
     * @param args
     */


    public static void main(String[] args) throws ParseException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        BankServiceImpl bankService= (BankServiceImpl) applicationContext.getBean("BankService");

        System.out.println(bankService.getBankName());
        Date date=bankService.getDate();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=sdf.format(date);


        List list=bankService.getList();
        if(list!=null){
            System.out.println(list.toString());
        }
    }
}

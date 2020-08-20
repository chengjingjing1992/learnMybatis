package com.school.springdemo;

/**
 * @author chengjinging
 * @date 2020/8/15 上午11:03
 *
 * 模拟jar包中的类, 获取
 */
public class FactoryInstance {



    public AccountService getAAccountService(){

        System.out.println("FactoryInstance 对象的"+ "ss");

        return new AccountServiceImpl();
    }

    public static AccountService getAcctSerice(){

        return new AccountServiceImpl();

    }

}

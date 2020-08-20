package com.school.springdemo;

/**
 * @author chengjinging
 * @date 2020/8/15 上午10:38
 */
public interface AccountService {


    AccountDao accountDao=new AccountDao();

    public void saveMoney();



}

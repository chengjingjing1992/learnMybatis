package com.school.test;

import com.school.entity.Account;
import com.school.mapper.AccountRepository;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/9/9 下午2:03
 * 演示动态sql
 *
 * 各种标签
 */
public class Test10 {

    @Test
    public void te1(){
        SqlSession session=BaseAction.getSqlSession();

        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        Account account=new Account();
        account.setAge(58);
        account.setBalance(20);
        List<Account> accounts=accountRepository.findAccount(account);

        for (Account a:accounts
             ) {
            System.out.println(a.toString());
        }

//        for (Object c:accounts
//             ) {
//
//            JSONObject jsonObject=new JSONObject();
//            System.out.println( jsonObject.fromObject(c).toString());
//
////            System.out.println( "==="+c.toString());
//        }

        session.commit();
        session.close();

    }

    @Test
    public void t2(){

        SqlSession session=BaseAction.getSqlSession();
        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        Account account=new Account();
        account.setId(1L);
        account.setUsername("liu22");
        account.setAge(58);
        account.setBalance(20);
        List<Account> accounts=accountRepository.findAccount2(account);

        for (Account a:accounts
        ) {
            System.out.println(a.toString());
        }
        session.commit();
        session.close();

    }

    @Test
    public void t3(){
        SqlSession session=BaseAction.getSqlSession();
        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        Account account=new Account();
        account.setId(1L);

        List<Account> accounts=accountRepository.findAccount3(account);

        for (Account a:accounts
        ) {
            System.out.println(a.toString());
        }
        session.commit();
        session.close();

    }

    @Test
    public void t4(){

        SqlSession session=BaseAction.getSqlSession();
        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        Account account=new Account();
        account.setId(100L);
        account.setUsername("shenyang");
        account.setBalance(99);
        int a=accountRepository.accountUpdate(account);
        System.out.println("a==="+ a);
        session.commit();
        session.close();

    }

    @Test
    public void t5f(){
        /**
         * set 标签
         */
        SqlSession session=BaseAction.getSqlSession();
        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        Account account=new Account();
        account.setUsername("xiaozhang");
        account.setBalance(20000);
        int a=accountRepository.accountUpdate2(account);
        System.out.println("a==="+ a);
        session.commit();
        session.close();

    }

    @Test
    public void t6f(){
        /**
         * foreach 标签
         */
        SqlSession session=BaseAction.getSqlSession();
        AccountRepository accountRepository=session.getMapper(AccountRepository.class);
        List list=new ArrayList();
        list.add(1);
        list.add(100);
        list.add(300);
        List<Account> accounts=accountRepository.findAccountsByIds(list);
        for (Account a:accounts
             ) {
            System.out.println(a.toString());
        }
        session.commit();
        session.close();

    }








}

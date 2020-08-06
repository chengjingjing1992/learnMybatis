package com.school.test;

import com.school.entity.Account;
import com.school.mapper.AccountRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test01 {
//    public static void main(String[] args) {
//        //加载MyBatis配置⽂文件
//        InputStream inputStream =
//                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
//                SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory =
//                sqlSessionFactoryBuilder.build(inputStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        String statement = "com.school.mapper.accountMapper.save";
//
//
//        Account account = new Account();
//        account.setPassword("123456");
//        account.setUsername("chengjing");
//        account.setAge(1);
//
//        sqlSession.insert(statement,account);
//        sqlSession.commit();
//
//    }

    public static void main(String[] args) {
                InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository=sqlSession.getMapper(AccountRepository.class);
        Account account = new Account();
        account.setPassword("123456");
        account.setUsername("zhangsan");
        account.setAge(3);
        accountRepository.save(account);

        sqlSession.commit();
        sqlSession.close();
    }










}

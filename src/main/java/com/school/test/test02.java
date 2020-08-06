package com.school.test;

import com.school.entity.Account;
import com.school.mapper.AccountRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test02 {

    public static void main(String[] args) {
        InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository=sqlSession.getMapper(AccountRepository.class);
        int rescode=accountRepository.delete(6);
        if(rescode==1){
            System.out.println("删除成功");
        }

        sqlSession.commit();
        sqlSession.close();
    }
}

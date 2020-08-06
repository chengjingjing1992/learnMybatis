package com.school.test;

import com.school.entity.Account;
import com.school.mapper.AccountRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class tes03 {

    public static void main(String[] args) {
        InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository=sqlSession.getMapper(AccountRepository.class);
        List<Account> accounts= accountRepository.getAcounts(2);
        for (Account c:accounts ) {
            System.out.println(c.toString());

        }


        sqlSession.close();

    }
}

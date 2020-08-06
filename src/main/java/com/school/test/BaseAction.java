package com.school.test;

import com.school.entity.Customer;
import com.school.mapper.CustomerMapper;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/8/1 上午12:12
 */
public class BaseAction {



    public static SqlSession getSqlSession(){
        InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }



}

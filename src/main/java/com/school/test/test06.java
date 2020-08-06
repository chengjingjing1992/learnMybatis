package com.school.test;

import com.school.entity.Customer;
import com.school.entity.Goods;
import com.school.mapper.CustomerMapper;
import com.school.mapper.GoodsMapper;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

import java.io.InputStream;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/8/1 上午12:00
 */
public class test06 {

//    public static void main(String[] args) {
//
//        SqlSession sqlSession=BaseAction.getSqlSession();
//        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
//        List<Customer> customers=customerMapper.findAllCustomers();
//        for (Customer c:customers
//             ) {
//            System.out.println(c.getId() +" " + c.getCustomerName());
//        }
//        sqlSession.close();
//    }

    @Test
    public  void test007(){
        SqlSession sqlSession=BaseAction.getSqlSession();
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers=customerMapper.findAllCustomers();
        for (Customer c:customers
        ) {
            System.out.println(c.getId() +" " + c.getCustomerName());
        }
        sqlSession.close();
    }

    @Test
    public void test0008(){
        SqlSession sqlSession=BaseAction.getSqlSession();
        GoodsMapper goodsMapper=sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goods= goodsMapper.findGoodsByCustomerID(2);
        for (Goods g:goods
             ) {
            System.out.println(g.getId() + " " + g.getGoodsName() );
        }



    }



}

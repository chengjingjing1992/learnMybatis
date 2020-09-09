package com.school.test;

import com.school.entity.Classes;
import com.school.entity.Customer;
import com.school.entity.Goods;
import com.school.entity.Student;
import com.school.mapper.ClassesRepository;
import com.school.mapper.CustomerMapper;
import com.school.mapper.GoodsMapper;
import com.school.mapper.StudentRepository;
import net.sf.json.JSONObject;
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

    @Test
    public void tes009(){
        /**
         * 测试延迟加载
         */
        SqlSession sqlSession=BaseAction.getSqlSession();
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
//        List<Object> students=studentRepository.findStudentById(1);
//        for (Object o:students
//             ) {
//            System.out.println( new JSONObject().fromObject(o).toString());
//        }
    }
    @Test
    public void tes0010(){
        /**
         * 测试延迟加载
         */
        SqlSession sqlSession=BaseAction.getSqlSession();
        System.out.println("*************单独获取班级****************");
        ClassesRepository classesRepository=sqlSession.getMapper(ClassesRepository.class);
        Classes classes=classesRepository.getClassById(2);
        System.out.println(classes.toString());
        System.out.println("*************单独获取学生和班级极联****************");
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        List<Object> stulist=studentRepository.getClassesAndStudnet(1);
        for (Object o:stulist
             ) {
            Student student=(Student)o;
            System.out.println(student.getClasses().getClassesName());
        }

        System.out.println("*************懒加载****************");
        Student student=studentRepository.findStudentById(1);
        System.out.println(student.getClasses().getClassesName());

        sqlSession.commit();
        sqlSession.close();




    }





}

package com.school.test;

import com.school.entity.Classes;
import com.school.entity.Student;
import com.school.mapper.ClassesRepository;
import com.school.mapper.StudentRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class test05 {
    /**
     * 一对多
     * @param args
     */
    public static void main(String[] args) {
        InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassesRepository classesRepository=sqlSession.getMapper(ClassesRepository.class);
        Classes classes=classesRepository.getClassesById(2);
        for (Student student:classes.getStudents()
             ) {
            System.out.println(classes.getClassesName() +" "+student.getName()+" " +student.getAge());
        }
        sqlSession.close();
    }
}

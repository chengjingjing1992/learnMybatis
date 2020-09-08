package com.school.test;

import com.school.entity.Classes;
import com.school.entity.Student;
import com.school.mapper.StudentRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class test04 {
    /**
     * 一对一
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
        StudentRepository atudentRepository=sqlSession.getMapper(StudentRepository.class);
        List<Object> students= atudentRepository.getClassesAndStudnet(1);
        for (Object c:students
             ) {
            Student s=(Student)c;

            Classes classes=s.getClasses();
            System.out.println(s.getName() +" " + s.getAge()+" "+ s.getClasses().getClassesName());
        }

        sqlSession.close();
    }
}

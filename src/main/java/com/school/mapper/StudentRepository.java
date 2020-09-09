package com.school.mapper;

import com.school.entity.Account;
import com.school.entity.Classes;
import com.school.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentRepository {
    List<Object> getClassesAndStudnet(int stuId);

    public Student findStudentById(@Param("id")int id);

}

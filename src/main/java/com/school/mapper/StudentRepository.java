package com.school.mapper;

import com.school.entity.Account;
import com.school.entity.Classes;

import java.util.List;

public interface StudentRepository {
    List<Object> getClassesAndStudnet(int stuId);

}

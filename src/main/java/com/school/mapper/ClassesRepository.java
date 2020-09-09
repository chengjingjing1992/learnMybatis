package com.school.mapper;

import com.school.entity.Classes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chengjinging
 * @date 2020/7/28 下午1:12
 */
public interface ClassesRepository {

    Classes getClassesById(int classId);
    Classes getClassById(@Param("id") int id);
}

package com.school.mapper;

import com.school.entity.Department;
import com.school.entity.DepartmentExample;
import java.util.List;

import com.school.entity.Employee;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    Department findById(@Param(value = "id") int id);

    List<Employee> findEmployeeByDeptId(@Param("deptid")int deptid);

    List<Object> findEmloyeesAndDepts(@Param("deptid") int deptid);

}
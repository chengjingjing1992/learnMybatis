package com.school.mapper;

import com.school.entity.Department;
import com.school.entity.Employee;
import com.school.entity.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {

    Employee findById(@Param(value = "id") int id);

    Object findByIdWithDept(@Param(value = "id") int id);

    List<String> findEmplyeeNames(@Param(value = "id") int id);

    List<Employee> findEmplyees(@Param(value = "id") int id);
}
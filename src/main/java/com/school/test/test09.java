package com.school.test;

import com.mysql.cj.xdevapi.JsonParser;
import com.school.entity.Department;
import com.school.entity.Employee;
import com.school.mapper.DepartmentMapper;
import com.school.mapper.EmployeeMapper;
import jdk.nashorn.internal.parser.JSONParser;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author chengjinging
 * @date 2020/9/8 下午3:11
 */
public class test09 extends BaseAction{


    public static void main(String[] args) {
        SqlSession session=getSqlSession();
        DepartmentMapper departmentMapper= session.getMapper(DepartmentMapper.class);
        Department department=departmentMapper.findById(1);
        System.out.println(department.toString());
//
        EmployeeMapper employeeMapper=session.getMapper(EmployeeMapper.class);
        Employee employee=employeeMapper.findById(1);
        System.out.println(employee.toString());

        Object object=employeeMapper.findByIdWithDept(1);
        JSONObject jsonObject=JSONObject.fromObject(object);
        System.out.println(jsonObject.toString());

        List<String> names=employeeMapper.findEmplyeeNames(1);
        System.out.println(names.toString());
        System.out.println("************************************************");

        List<Employee> employees=employeeMapper.findEmplyees(1);
        System.out.println(employees.toString());
        System.out.println("******************findEmployeeByDeptId******************************");
        List<Employee> employeeList=departmentMapper.findEmployeeByDeptId(2);
        System.out.println(employeeList.toString());
        System.out.println("******************获取部门和员工信息******************************");
        List<Object> objects=departmentMapper.findEmloyeesAndDepts(2);
        System.out.println("objects.size()"+objects.size());
        for (Object o:objects
             ) {
            System.out.println(o.toString());
        }










        session.commit();
        session.close();
    }


}

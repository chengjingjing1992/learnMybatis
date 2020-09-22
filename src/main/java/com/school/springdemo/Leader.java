package com.school.springdemo;

import com.school.entity.Department;

/**
 * @author chengjinging
 * @date 2020/9/13 下午12:59
 */
public class Leader {

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void getLeaderDept(){
        System.out.println(this.department.getName());
    }


}

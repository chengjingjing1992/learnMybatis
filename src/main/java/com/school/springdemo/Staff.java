package com.school.springdemo;

import com.school.entity.Department;

/**
 * @author chengjinging
 * @date 2020/9/13 下午12:48
 */
public class Staff {

    private Department department;

    public Staff(Department department) {
        this.department = department;
    }

    public void getDept(){
        System.out.println(this.department.getName());
    }
}

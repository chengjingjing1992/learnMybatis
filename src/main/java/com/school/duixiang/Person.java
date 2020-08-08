package com.school.duixiang;

/**
 * @author chengjinging
 * @date 2020/8/8 下午2:55
 */
public class Person  extends Animal implements Career ,FamilyRole {

    public void getCarrerName() {
        System.out.println("获取职业名称");
    }

    public void getSalary() {
        System.out.println("获取薪资");

    }

    public void getRoleName() {
        System.out.println("获取家庭角色");
    }
}

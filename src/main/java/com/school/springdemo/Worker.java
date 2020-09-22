package com.school.springdemo;

import java.util.Date;

/**
 * @author chengjinging
 * @date 2020/9/13 下午12:28
 */
public class Worker {

    private String name;
    private Integer age;
    private Date joinDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", joinDate=" + joinDate +
                '}';
    }
}

package com.school.springdemo;

/**
 * @author chengjinging
 * @date 2020/9/13 上午11:10
 */
public class Student {

    public Teacher getTeacher(){
        return new Teacher();
    }
    public static Teacher getMathTeacher(){
        return new Teacher("张静","数学");
    }

}

package com.school.test;

/**
 * @author chengjinging
 * @date 2020/8/3 下午11:38
 */
public class Test {

    int num;
    public void show(){

        System.out.println(num);
        int num=10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Test().show();
    }
}

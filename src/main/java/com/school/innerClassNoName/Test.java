package com.school.innerClassNoName;

import javax.crypto.spec.PSource;

/**
 * @author chengjinging
 * @date 2020/8/9 上午11:01
 *
 * 匿名内部类演示
 */
public class Test {

    public static void main(String[] args) {
        /**
         *
         */
        Introdude introdude=new ChineseIntroduce();
        introdude.introduce("张三");
    }

    @org.junit.Test
    public void test01(){
        /**
         * 非匿名内部类
         */
        Introdude introdude=new ChineseIntroduce();
        introdude.introduce("张三");
    }

    @org.junit.Test
    public void test02(){
        /**
         * 匿名内部类方式
         */

        Introdude introdudeEnglish=new Introdude(){

            public void introduce(String name) {
                System.out.println("My English name is " + name );
            }
        };
        introdudeEnglish.introduce("Joe");

    }
}

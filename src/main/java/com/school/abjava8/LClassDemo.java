package com.school.abjava8;

/**
 * @author chengjinging
 * @date 2020/9/12 下午7:37
 */
public class LClassDemo {
    public static void main(String[] args) {
        int num=10;
        LClass lClass=()->{
            int num2=0;
            System.out.println("hello" );
            System.out.println("hello" + num2++);

        };
        lClass.sayHello();
        Runnable runnable=() ->{
                System.out.println("run");

        };
        runnable.run();
    }
}

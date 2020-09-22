package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/9/14 下午6:46
 *
 * 一个线程运行时发生异常会怎样?
 *
 */
public class ExceptionThreadDemo {


    static volatile int a=0;
    public static void main(String[] args) {


        Thread thread=new Thread(() ->{
            while (true){
                a++;
                System.out.println("a++      ==="+a);
                if(a>20000 || a<-20000){
                   a=0;

                    try {
                        int result=1/0;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(a);
                }
            }

        }
        );

        thread.start();



    }
}

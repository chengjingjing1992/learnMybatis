package com.school.abThreadPool;

/**
 * @author chengjinging
 * @date 2020/8/11 上午12:20
 */
public class Mytest {



    public void run(){
        stand();
        System.out.println("run....");
        arrive();

    }
    public void stand(){

        System.out.println("stand....");

    }

    public static void arrive(){
        System.out.println("arrive......");
    }

    public static void main(String[] args) {
        Mytest mytest=new Mytest();
        mytest.run();
    }


}

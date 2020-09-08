package com.school.abThreadPool;

/**
 * @author chengjinging
 * @date 2020/8/11 上午12:14
 */
public class Su {

    int a=10;
    static int b=10;

    public void hello(){
        go();
        hi();
    }
    public void hi(){
        hello();
    }

    public static void go(){
        System.out.println("go.....");
//        int yyy=a;
        int yyy=b;
        run();

    }
    public static void run(){

    }

    public static void main(String[] args) {
        Su su=new Su();
        su.hello();
    }

}

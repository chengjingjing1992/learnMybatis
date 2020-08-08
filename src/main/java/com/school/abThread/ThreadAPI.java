package com.school.abThread;

import org.junit.Test;

/**
 * @author chengjinging
 * @date 2020/8/8 下午11:25
 *
 *
 *
 *
 *
 *
 */
public class ThreadAPI {

    @Test
    public void getTherdName(){

        System.out.println(Thread.currentThread().getName());
    }
    @Test
    public void setThreadName(){
        EatThread eatThread=new EatThread("吃饭");
        /**
         * 获取线程名称
         */
        System.out.println(eatThread.getName());
        /**
         * 改变线程名称
         */
        eatThread.setName("用餐");
        System.out.println(eatThread.getName());


    }




    public static void main(String[] args) throws InterruptedException {

        TestThreadSleep testThreadSleep=new TestThreadSleep();
        testThreadSleep.setName("测试线程");
        testThreadSleep.start();

    }
}

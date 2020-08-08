package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/8 下午11:34
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        testThread.start();
        new TestThread().start();
        new TestThread().start();
        /**
         * 获取线程名称
         *
         */
        System.out.println(Thread.currentThread().getName());


    }
}

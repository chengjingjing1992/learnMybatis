package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 上午12:11
 */
public class ThreadByRunnable implements Runnable{

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        /**
         * 通过 implements Runnable 创建的线程没有 start()方法，
         * 必须创建对象，将引用作为参数传给 new Thread() ,再调用start()方法
         */
        ThreadByRunnable runnable=new ThreadByRunnable();

        Thread thread=new Thread(runnable);
        thread.setName("runnable 线程");
        thread.start();
    }
}

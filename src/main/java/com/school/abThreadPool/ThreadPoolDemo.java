package com.school.abThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chengjinging
 * @date 2020/8/10 下午10:11
 */
public class ThreadPoolDemo {
    static int tickets=10000;

    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        executorService.submit(new Runnable() {
            @Override
            public void run() {


                try {
                    System.out.println(Thread.currentThread().getName()+"开始执行1任务");
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName()+"执行1任务结束");

                    System.out.println(Thread.currentThread().getName()+"归还线程");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println(Thread.currentThread().getName()+"开始执行2任务");
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName()+"执行2任务结束");

                    System.out.println(Thread.currentThread().getName()+"归还线程");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +"执行3任务");
            }
        });

    }
}

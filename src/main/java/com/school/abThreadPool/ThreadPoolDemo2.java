package com.school.abThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author chengjinging
 * @date 2020/8/10 下午10:11
 */
public class ThreadPoolDemo2 {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        });

        Future task=executorService.submit(()->{

                System.out.println("当前执行线程：" + Thread.currentThread().getId());
            }
        );

        executorService.execute(()->{
            System.out.println("当前执行线程：" + Thread.currentThread().getId());
        });

    }
}

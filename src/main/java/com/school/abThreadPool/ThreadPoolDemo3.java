package com.school.abThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chengjinging
 * @date 2020/8/10 下午10:11
 */
public class ThreadPoolDemo3 {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();

        executorService.submit(()-> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("当前执行线程：" + Thread.currentThread().getId());


                }
        );
        executorService.submit(()-> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                    System.out.println("当前执行线程：" + Thread.currentThread().getId());


                }
        );
        executorService.submit(()-> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                    System.out.println("当前执行线程：" + Thread.currentThread().getId());


                }
        );
        executorService.submit(()-> {

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                    System.out.println("当前执行线程：" + Thread.currentThread().getId());


                }
        );





    }
}

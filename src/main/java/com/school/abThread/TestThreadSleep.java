package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/8 下午11:49
 */
public class TestThreadSleep extends Thread{

    public void run() {
        Thread t=Thread.currentThread();
        for (int i=1;i<=60;i++){
            System.out.println(t.getName());

            try {
                t.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}

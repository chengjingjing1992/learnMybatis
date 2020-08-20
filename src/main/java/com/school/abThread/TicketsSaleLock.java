package com.school.abThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chengjinging
 * @date 2020/8/9 下午7:44
 */
public class TicketsSaleLock implements Runnable{
    private int tickets=100;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            l.lock();
            if (tickets >0){
                try {
                    Thread.sleep(1000);
                    int a=tickets;
                    tickets=tickets-1;
                    System.out.println("当前线程:" + Thread.currentThread().getName()  + " 正在买票第："+a +"张。还剩下票数：" + tickets);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }finally {
                    /**
                     * 无论是否出现异常都执行
                     */
                    l.unlock();
                }
            }else { 
                l.unlock();
            }


        }
    }
}

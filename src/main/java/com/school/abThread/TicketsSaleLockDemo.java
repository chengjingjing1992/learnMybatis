package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午11:19
 */
public class TicketsSaleLockDemo {

    public static void main(String[] args) {
        TicketsSaleLock ticketsSaleLock=new TicketsSaleLock();
        Thread t1=new Thread(ticketsSaleLock);
        Thread t2=new Thread(ticketsSaleLock);
        Thread t3=new Thread(ticketsSaleLock);
        t1.setName("线程1");
        t1.start();
        t2.setName("线程2");
        t2.start();
        t3.setName("线程3");
        t3.start();


    }
}

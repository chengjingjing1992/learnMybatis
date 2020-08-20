package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午8:03
 */
public class TicketsSaleSychornizeDemo {

    public static void main(String[] args) {
        TicketsSaleSychornize ticketsSaleSychornize=new TicketsSaleSychornize();
        Thread t1=new Thread(ticketsSaleSychornize);
        Thread t2=new Thread(ticketsSaleSychornize);
        Thread t3=new Thread(ticketsSaleSychornize);
        t1.setName("线程1");
        t1.start();
        t2.setName("线程2");
        t2.start();
        t3.setName("线程3");
        t3.start();
    }
}

package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午9:56
 */
public class TicketsSaleSychornizeMethodDemo {

    public static void main(String[] args) {
        TicketsSaleSychornizeMethod ticketsSaleSychornizeMethod=new TicketsSaleSychornizeMethod();
        Thread t1=new Thread(ticketsSaleSychornizeMethod);
        Thread t2=new Thread(ticketsSaleSychornizeMethod);
        Thread t3=new Thread(ticketsSaleSychornizeMethod);
        t1.setName("线程1");
        t1.start();
        t2.setName("线程2");
        t2.start();
        t3.setName("线程3");
        t3.start();
    }
}

package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午7:50
 *
 * 线程不安全情况下 出现卖第-1 张票
 *
当前线程:线程2 正在买票第：3张。还剩下票数：1
当前线程:线程3 正在买票第：2张。还剩下票数：1
当前线程:线程1 正在买票第：3张。还剩下票数：1
当前线程:线程2 正在买票第：1张。还剩下票数：0
当前线程:线程3 正在买票第：0张。还剩下票数：-1
当前线程:线程1 正在买票第：-1张。还剩下票数：-2
 */
public class TicketsSaleDemo {
    public static void main(String[] args) {
        TicketsSale ticketsSale=new TicketsSale();
        Thread t1=new Thread(ticketsSale);
        Thread t2=new Thread(ticketsSale);
        Thread t3=new Thread(ticketsSale);
        t1.setName("线程1");
        t1.start();
        t2.setName("线程2");
        t2.start();
        t3.setName("线程3");
        t3.start();

    }
}

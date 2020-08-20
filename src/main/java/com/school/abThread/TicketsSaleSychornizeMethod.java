package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午7:44
 */
public class TicketsSaleSychornizeMethod implements Runnable{
    private int tickets=10000;
    @Override
    public void run() {

            while (true){
                saleTickets();
            }

    }

    /**
     * 同步方法
     *
     */

    public synchronized void saleTickets(){
        if(tickets >0 ){
            int a=tickets;
            tickets=tickets-1;
            System.out.println("当前线程:" + Thread.currentThread().getName()  + " 正在买票第："+a +"张。还剩下票数：" + tickets);
        }


    }



}

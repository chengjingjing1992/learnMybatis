package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午6:51
 */
public class TheradSafety {
    //总共余票1000张
    static int tickets=10000;
    static int aa;
    static int bb;

    public static void main(String[] args) {


        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                int  a=0;
                while (tickets >0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets=tickets-1;
                    a=a+1;
                    System.out.println("当前线程:" + Thread.currentThread().getName()  + "   已抢票数："+ a +"剩余票数："+tickets);

                }
                System.out.println("A线程最终抢到票数="+a + "剩余票="+tickets);
                aa=a;

            }
        });
        thread.setName("A线程");
        thread.start();

        new Thread("B线程"){
            @Override
            public void run() {
                int  b=0;
                while (tickets >0){

                    tickets=tickets-1;
                    b=b+1;
                    System.out.println("当前线程:" + Thread.currentThread().getName()  + "   已抢票数："+ b +"剩余票数："+tickets);

                }
                System.out.println("B线程最终抢到票数="+b + "剩余票="+tickets);
                bb=b;
            }
        }.start();

        /**5193+4817=10010
         * 当前线程:B线程   已抢票数：5188剩余票数：5
         *         当前线程:B线程   已抢票数：5189剩余票数：4
         *         当前线程:B线程   已抢票数：5190剩余票数：3
         *         当前线程:B线程   已抢票数：5191剩余票数：2
         *         当前线程:B线程   已抢票数：5192剩余票数：1
         *         当前线程:B线程   已抢票数：5193剩余票数：0
         *         B线程最终抢到票数=5193剩余票=0
         *         当前线程:A线程   已抢票数：4817剩余票数：448
         *         A线程最终抢到票数=4817剩余票=0
         */






    }
}

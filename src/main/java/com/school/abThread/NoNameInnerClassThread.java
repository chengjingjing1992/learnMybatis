package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/9 下午5:51
 * 匿名内部类实现 多线程
 */
public class NoNameInnerClassThread {
    static int tickets=100;

    public static void main(String[] args) {


        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1 ;i<=600;i++){
                    tickets=tickets-1;
                    System.out.println(  tickets +"     " + Thread.currentThread().getName() );
                }
            }
        });
        thread.setName("A线程");
        thread.start();

        new Thread("B线程"){
            @Override
            public void run() {
                for (int i=1 ;i<=600;i++){
                    System.out.println( i +"     " + Thread.currentThread().getName() );
                }
            }
        }.start();



        for (int i=1 ;i<=600;i++){
            System.out.println( i +"     " + Thread.currentThread().getName() );
        }
    }
}

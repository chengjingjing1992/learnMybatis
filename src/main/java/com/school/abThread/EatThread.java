package com.school.abThread;

import org.junit.Test;

/**
 * @author chengjinging
 * @date 2020/8/8 下午8:41
 */
public class EatThread  extends Thread{

    public EatThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("开始执行run方法      当前线程：" + Thread.currentThread().getName() );
        for(int i=0;i<2000;i++){

            System.out.println("恰饭。。。。。第"+ i + "口   当前线程："+ Thread.currentThread().getName());

        }
    }


    public static void main(String[] args) {
        /**
         *
         * 调用start() 方法 ，每个新建线程开辟一个新的栈内存空间，多线程执行
         */
        boolean isDuoXianCheng=false;//演示用手动控制
        if (isDuoXianCheng){
            Thread threadEat=new EatThread("吃饭线程");
            threadEat.start();

            Thread thread=new TalkThread("讲话线程");
            thread.start();
            for(int i=0;i<2000;i++){

                System.out.println("恰饭。。。。。第"+ i + "口   当前线程："+ Thread.currentThread().getName());

            }
        }
        /**
         * 只调用run() 方法，没有开辟新的栈空间，是单线程执行，几个run()方法按照顺序依次执行输出 且 当前线程都是：main
         */
        Thread threadEat=new EatThread("吃饭线程");
        threadEat.run();

        Thread thread=new TalkThread("讲话线程");
        thread.run();
        for(int i=0;i<2000;i++){

            System.out.println("恰饭。。。。。第"+ i + "口   当前线程："+ Thread.currentThread().getName());

        }

    }
}

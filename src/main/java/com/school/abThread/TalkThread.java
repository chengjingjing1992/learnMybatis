package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/8/8 下午8:45
 */
public class TalkThread extends Thread{
    public TalkThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<2000;i++){
            System.out.println("讲话。。。。。第"+ i + "句   当前线程："+ Thread.currentThread().getName());

        }
    }
}

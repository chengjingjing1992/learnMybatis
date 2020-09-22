package com.school.abThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chengjinging
 * @date 2020/9/10 下午2:10
 */
public class CallableDemo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask=new FutureTask(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
                return "我是返回值";
            }
        );
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}

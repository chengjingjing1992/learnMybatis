package com.school.abThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chengjinging
 * @date 2020/9/10 下午1:57
 */
public class CallableDemo {


    public static void main(String[] args)
            throws ExecutionException, InterruptedException {

        CallableImpl1 callableImpl1=new CallableImpl1();
        FutureTask futureTask=new FutureTask(callableImpl1);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }
}

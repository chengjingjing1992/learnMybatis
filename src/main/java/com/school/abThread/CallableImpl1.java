package com.school.abThread;

import java.util.concurrent.Callable;

/**
 * @author chengjinging
 * @date 2020/9/10 下午1:53
 */
public class CallableImpl1 implements Callable {
    @Override
    public Object call() throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String str="123";
        return str;
    }
}

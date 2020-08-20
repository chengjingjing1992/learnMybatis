package com.school.ablamba;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

/**
 * @author chengjinging
 * @date 2020/8/11 下午9:33
 *
 *
 * lamda 表达式建立线程
 *
 */
public class Demo1 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动。。。");
            }
        }).start();

        new Thread(
                ()->{
                    System.out.println(Thread.currentThread().getName() + "线程启动。。。");
                }
        ).start();

    }

}

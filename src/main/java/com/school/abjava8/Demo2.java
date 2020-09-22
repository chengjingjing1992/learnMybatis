package com.school.abjava8;

import org.junit.Test;

/**
 * @author chengjinging
 * @date 2020/9/12 下午7:50
 */
public class Demo2 {

    @Test
    public  void t1(){
        /**
         * 有参数无返回值
         */

        Factory factory=(x)->{
            System.out.println("生产了"+x);
        };
        factory.get("冰箱");
        factory.get("洗衣机");
    }
}

package com.school.hash;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/9 下午2:59
 */
public class Test {

    public static void main(String[] args) {
        /**
         * Desk 没有重写 eaqual()方法，这里比较的是引用地址 必然输出 false
         */
        System.out.println(new Desk().equals(new Desk()));

        System.out.println(Objects.equals(1,1));
        System.out.println(Objects.equals("爱","爱"));

        /**
         * Chair 有重写 eaqual()方法，这里比较的是对象内容是否相同 必然输出 true
         */

        System.out.println(new Chair("100","100","100","100").equals(new Chair("100","100","100","100")));

        System.out.println(new Floor().equals(new Floor()));


    }
}

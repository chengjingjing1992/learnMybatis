package com.school.hash;

/**
 * @author chengjinging
 * @date 2020/8/9 下午2:52
 *
 * 继承 Object类通过hashCode() 得到哈希值
 */
public class HashDemo  extends Object{

    public static void main(String[] args) {
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());

        HashDemo hashDemo=new HashDemo();
        /**
         * 继承 Object 类 从而获得hashCode() 得到 哈希值
         */
        System.out.println(hashDemo.hashCode());
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}

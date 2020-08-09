package com.school.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author chengjinging
 * @date 2020/8/9 下午4:11
 */
public class HashSetDemo {


    public static void main(String[] args) {
        Set set= new HashSet<>();
        set.add("zhangsan");
        set.add("zhangsan");
        set.add("zhangsan");
        set.add(1);
        set.add(1);
        set.add(2);
        /**
         * 迭代器遍历set 集合
         */
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********************************");
        for (Object o: set
             ) {
            System.out.println(o);
        }







    }
}

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
        /**
         * 增强for循环遍历set 集合
         */
        for (Object o: set
             ) {
            System.out.println(o);
        }
        System.out.println("set 要保证存储的元素不重复，存储的元素必须重写 equal() 和 hashCode()  *********************************");
        Set set2= new HashSet<>();
        set2.add(new Desk());
        set2.add(new Desk());
        for (Object o: set2
        ) {

            System.out.println( "存储元素没有重写"+ o);
        }

        Set set3= new HashSet<>();
        set3.add(new Floor());
        set3.add(new Floor());
        for (Object o: set3
        ) {

            System.out.println( "存储元素有重写"+ o);
        }











    }
}

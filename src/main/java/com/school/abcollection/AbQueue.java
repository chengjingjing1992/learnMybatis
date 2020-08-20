package com.school.abcollection;

import java.util.*;

/**
 * @author chengjinging
 * @date 2020/8/13 上午11:34
 */
public class AbQueue {

    public static void get() {
        Thread thread= new Thread();
    }


    public static void main(String[] args) {





       Set set=new HashSet();
        set.add(44);
        set.add(1);
        set.add(5);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            int a=(int)iterator.next();
            if ( a==44){
                iterator.remove();
            }else {
                System.out.println( a );
            }

        }
        Iterator iterator1=set.iterator();
        System.out.println("*************");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }







    }
}

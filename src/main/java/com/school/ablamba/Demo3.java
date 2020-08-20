package com.school.ablamba;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author chengjinging
 * @date 2020/8/11 下午10:46
 *
 * 演示 Arrays.sort 方法对对象进行排序
 *  前减后 生序
 *
 */
public class Demo3 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return (int)o1 - (int)o2;
    }

    public static void main(String[] args) {
        System.out.println( new Demo3().compare(1,2));

        Integer [] arr=new Integer[]{44,2,45,20,10};

        Arrays.sort( arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int)o1 - (int)o2;
            }
        });
        System.out.println(Arrays.toString(arr));


    }











//    public static void main(String[] args) {
//        int [] arr=new int[]{  13,20 ,9,5};
//        Arrays.sort(arr,new Comparator<Integer>(){
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return ;
//            }
//        });
//    }
}

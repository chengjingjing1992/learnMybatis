package com.school.ablamba;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author chengjinging
 * @date 2020/8/11 下午11:28
 */
public class Demo4 {


    public static void main(String[] args) {

        Person []  pesons= new Person[]{
                new Person("张三",18),
                new Person("王五",40),
                new Person("赵六",13),
                new Person("钱三",19)

        };

        Arrays.sort(pesons,(Person o1, Person o2) ->{
                return o1.getAge()-o2.getAge();
            }
        );
        for (int i=0;i < pesons.length;i++){
            System.out.println(pesons[i].getName() +  "    "+pesons[i].getAge());
        }


    }


}

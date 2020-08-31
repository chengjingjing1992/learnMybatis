package com.school.test;

import java.util.*;

/**
 * @author chengjinging
 * @date 2020/8/7 上午7:47
 */
public class test07 {

    public static void main(String[] args) {
        HashMap map1=new HashMap();
        map1.put("key","value");
        Map map= (Map) Collections.unmodifiableMap(map1);
        map1.put("key","valu");
        System.out.println(map.get("key"));
//        map.put("key","value1");
//        System.out.println(map.get("key"));


        System.out.println(0.1*3);








    }
    public void test02(){
        System.out.println("22222");
    }
    public void test03(){
        System.out.println("3333");
    }


    public void test05() {
        System.out.println("this is add from branch jing_1");
    }
    public void test04(){
        System.out.printf(" add in branch jing2");




    }

}

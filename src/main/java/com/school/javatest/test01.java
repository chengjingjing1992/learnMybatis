package com.school.javatest;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
cl * @author chengjinging
 * @date 2020/8/7 下午8:54
 */
public class test01 {

    @Test
    public void test0001(){
        Map map=new TreeMap();
        map.put(1,"chengjing");
        map.put(2,"lisi");
        map.put(3,"wangzulan");
        map.put(4,"zhaoliu");

        System.out.println(map.keySet());
    }
}

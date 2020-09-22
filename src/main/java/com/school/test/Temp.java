package com.school.test;

import java.util.HashMap;

/**
 * @author chengjinging
 * @date 2020/9/12 下午2:20
 */
public class Temp {

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("a","b");
        map.put("a","b");
        map.put("c","d");
        map.put("通话","111");
        map.put("重地","222");
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
        System.out.println(map.toString());


    }
}

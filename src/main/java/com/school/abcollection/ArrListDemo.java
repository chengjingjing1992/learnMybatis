package com.school.abcollection;

import com.school.ablamba.Person;
import org.junit.Test;

import java.util.*;

/**
 * @author chengjinging
 * @date 2020/8/14 下午10:25
 */
public class ArrListDemo {

    /**
     *  arrayList 元素去重复
     * @param args
     */


    public static void main(String[] args) {


    }

    @Test
    public void arrayListQuChong(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("1");
        arrayList.add("zhangsan");
        arrayList.add("zhangsan");
        arrayList.add("wangwu");
        HashMap map=new HashMap();
        map.put(1,"z");
        map.put("1","x");
        System.out.println(map.toString());
        for (int i=0;i<arrayList.size();i++){
            map.put(arrayList.get(i),"1");

        }
        System.out.println(arrayList.toString());


//        Set set=map.keySet();
//        System.out.println("set.toString()"+set.toString());
//        for (Object o:set
//             ) {
//            System.out.println(o.toString());
//        }

    }



    @Test
    public void arrayListQuchong2(){

        ArrayList arrayList=new ArrayList();
        arrayList.add("1");
        arrayList.add("zhangsan");
        arrayList.add("zhangsan");
        arrayList.add("wangwu");
        Set set=new HashSet();
        set.addAll(arrayList);
        System.out.println(set.toString());



    }

    @Test
    public void setmy(){

        Set set=new HashSet();
        set.add(new Dog("wang"));
        set.add(new Dog("wang"));
        System.out.println(set.toString());
    }

}

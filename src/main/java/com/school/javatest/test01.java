package com.school.javatest;

import org.junit.Test;

import java.util.*;

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
        System.out.println("222");
        System.out.println(map.keySet());


        System.out.println("444");

    }
//   0 1 2 3 5 8 13

    public static int getJie( int a){
        if(a==0){
            return 1;
        }else {
            return a*getJie(a-1);
        }

    }
    public static int getFei( int n){

        if(n<=0){
            return -1;
        }
        else if(n==1||n==2){
            return 1;
        }else {

            return getFei(n-1)+getFei(n-2)+getFei(n-2)+getFei(n-3);
        }


    }


    public static int getyazi(int m ,int n){

        if (n-1 <=0){
            System.out.println("经过第"+ n   +"还剩下"+ m +"卖出" + ((m+1)*2-m) );
            return (m+1)*2;
        }

        System.out.println("经过第"+ n   +"还剩下"+ m +"卖出" + ((m+1)*2-m) );
        return getyazi((m+1)*2,n-1);
    }



    public static void main(String[] args) {
//        System.out.println(getJie(5));
//        System.out.println(getyazi(2,7));

        int [] arr=new int[10];
        arr[0]=1;
        System.out.println(arr.length);
    }

    @Test
    public void test0004(){
        HashMap map=new HashMap();
    }
    @Test
    public void test0005(){
        /**
         * Vector
         */
        Vector vector=new Vector();
        vector.add(1);
        vector.add("yy");
        System.out.println(vector.toString());
    }
    @Test
    public void test0006(){
        /**
         * 数组转链表
         */
        String [] arr=new String []{ "zhang","wang ","li","qian"};


        List list=Arrays.asList(arr);
        System.out.println(list.toString());

        /**
         * 链表转数组
         */

        String [] rrr= (String[]) list.toArray();
        System.out.println(Arrays.toString(rrr));


    }

    @Test
    public void test0007(){
        /**
         * hashtable
         */
        Hashtable hashtable=new Hashtable();
        hashtable.put(1,"zhansan");
        hashtable.put(2,"lisi");
        hashtable.put(3,"wangwu");
        System.out.println(hashtable.toString());

    }
    @Test
    public void test0008(){
        /**
         *poll，remove 区别：
         *
         * remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
         *
         * peek，element区别：
         *
         * element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
         */
        Queue queue= new LinkedList();
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
        queue.offer("g");

        //删除第一个元素 并返回
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
        System.out.println("element="+queue.element()); //返回第一个元素
        System.out.println(queue.toString());
        System.out.println("peek="+queue.peek());
        System.out.println(queue.toString());

    }



    @Test
    public void test0009(){
        /**
         * 迭代器 Iterator
         */
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map map=new HashMap();
        map.put(1,"cheng");
        map.put(2,"jing");
        map.put(3,"love");
        map.put(4,"you");

        Iterator iterator1=map.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


    }
    @Test
    public void test0010(){
        Map map=new HashMap();
        map.put(1,"cheng");
        map.put(2,"jing");
        map.put(3,"love");
        map.put(4,"you");

        Set<Map.Entry> set=map.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }






}

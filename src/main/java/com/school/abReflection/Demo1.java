package com.school.abReflection;

import java.lang.reflect.Field;

/**
 * @author chengjinging
 * @date 2020/8/19 下午9:15
 */
public class Demo1 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class catClass=Cat.class;
        /**
         * getField 获取public 修饰的成员变量
         */
        Field sex1= catClass.getField("sex1");
        System.out.println(sex1);
//        Field sex2= catClass.getField("sex2");
//        System.out.println(sex2);
//        Field sex3= catClass.getField("sex3");
//        System.out.println(sex3);
//        Field sex4= catClass.getField("sex4");
//        System.out.println(sex4);
        Cat cat =new Cat("咖啡猫","20斤","母猫");

        Object value=sex1.get(cat);
        System.out.println(value);

        sex1.set(cat,"公猫");
        System.out.println( " set 值之后 "+sex1.get(cat));
        System.out.println("********************************");
        /**
         * getDeclaredField 获取所有的成员变量
         */

        Cat mimi=new Cat("咖啡猫","20斤","公猫","母猫","双性猫","无性别猫妖");
        Field sex2=catClass.getDeclaredField("sex2");
        System.out.println("sex2=="+ sex2.get(mimi));


        Field sex3=catClass.getDeclaredField("sex3");
        System.out.println("sex3"+sex3.get(mimi));
        /**
         * sex4 这个变量是private 修饰的
         * 必须 忽略 访问权限修饰符的安全检查
         */
        Field sex4=catClass.getDeclaredField("sex4");
        sex4.setAccessible(true);//暴力反射
        System.out.println("sex4"+sex4.get(mimi));












    }
}

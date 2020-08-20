package com.school.abReflection;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/18 下午10:28
 */
public class Person {

    private String name;
    private int age;
    public String sex_pub;
    String sex_defau;
    protected String sex_protected;
    private String sex_priva;




    public Person(String name, int age, String sex_pub) {
        this.name = name;
        this.age = age;
        this.sex_pub=sex_pub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getSex_defau() {
        return sex_defau;
    }

    public void setSex_defau(String sex_defau) {
        this.sex_defau = sex_defau;
    }

    public String getSex_protected() {
        return sex_protected;
    }

    public void setSex_protected(String sex_protected) {
        this.sex_protected = sex_protected;
    }

    public String getSex_priva() {
        return sex_priva;
    }

    public void setSex_priva(String sex_priva) {
        this.sex_priva = sex_priva;
    }

    public static void main(String[] args)  {
//        演示获取Class 对象
        /**方式一：
         * class.forName("全类名");
         * 方式二:
         * 对象.getClass()
         * 方式三:
         * 类名.class
         */

        Class cls=null;

        try {
            cls=Class.forName("com.school.abReflection.Person");

        }catch (ClassNotFoundException e ){

            e.printStackTrace();
        }
        Method  [] method=cls.getMethods();
//        method[0].invoke();


    }







}

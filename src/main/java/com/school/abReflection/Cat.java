package com.school.abReflection;

/**
 * @author chengjinging
 * @date 2020/8/19 下午9:48
 */
public class Cat {

    private String name;
    private String weight;
    public  String sex1;
    String sex2;
    protected String sex3;
    private String sex4;

    public Cat() {
    }
    public Cat(String name) {
        this.name=name;
    }


    public Cat(String name, String weight, String sex1, String sex2, String sex3, String sex4) {
        this.name = name;
        this.weight = weight;
        this.sex1 = sex1;
        this.sex2 = sex2;
        this.sex3 = sex3;
        this.sex4 = sex4;
    }
    public Cat(String name, String weight, String sex1) {
        this.name = name;
        this.weight = weight;
        this.sex1 = sex1;
        this.sex2 = sex2;
        this.sex3 = sex3;
        this.sex4 = sex4;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", sex1='" + sex1 + '\'' +
                ", sex2='" + sex2 + '\'' +
                ", sex3='" + sex3 + '\'' +
                ", sex4='" + sex4 + '\'' +
                '}';
    }

    public void eat(String food){
        System.out.println("吃"+food+".........");
    }
    public void work(){
        System.out.println("捕捉老鼠.....");
    }










}

package com.school.ablamba;

/**
 * @author chengjinging
 * @date 2020/8/11 下午10:26
 *
 *
 */
public class Demo2 {


    public static void getFood(Cooker cooker){
        cooker.makeFood();
    }

    public static void main(String[] args) {

        new Demo2().getFood(()->{
            System.out.println("食物制作出来");
        });
    }
}

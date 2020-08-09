package com.school.innerClass;

/**
 * @author chengjinging
 * @date 2020/8/9 上午9:30
 *
 * 内部类 外部类 变量名称相同
 */
public class Body {

    String color="黄色";
    public class Heart{
        String color ="红色";

        public void getColor(){
            String color ="黑色";
            System.out.println(color); // 输出黑色
            System.out.println(this.color);  // 输出红色
            /**
             * Body.this.color
             */
            System.out.println(Body.this.color); //输出黄色

        }


    }

    public static void main(String[] args) {
        Body.Heart heart=new Body().new Heart();
        heart.getColor();
    }
}

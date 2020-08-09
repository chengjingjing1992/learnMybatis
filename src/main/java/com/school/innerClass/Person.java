package com.school.innerClass;

/**
 * @author chengjinging
 * @date 2020/8/9 上午8:01
 */
public class Person {

    private String personname;

    public Person(String personname){
        this.personname=personname;
    }



    public void run(){


    }
    public void heartJump(){
        Heart heart=new Heart();
        heart.jump();
    }

    /**
     * Heart 成员内部类  因为在类中方法外
     */
    public class Heart{
        public void jump(){
            System.out.println( "我叫"+personname+"   我的心脏跳跳  蹦！蹦！蹦！");
        }


        public class Blood{
            private String color;
            public Blood(String color){

                this.color=color;

            }


            public void flow(){
                System.out.println( "血液在流动 颜色是："+ color);
            }
        }
    }

    public static void main(String[] args) {

        /**直接方式：
         * 如何使用成员内部类？
         * 外部类名称.内部类名称 对象名= new 外部类名称().new 内部类名称();
         */

        /**
         * 内部类有一个内部类
         */
        Person.Heart heart=new Person("成jj").new Heart();
        heart.jump();
        /**
         * 内部类中的内部类 又有另外一个内部类
         */
        Person.Heart.Blood blood=new Person("chengjj").new Heart().new Blood("蓝色");
        blood.flow();

        /** 间接方式：
         * 如何使用成员内部类？方法1：
         * 外部类的方法调用内部类的方法，
         * main调用外部类方法
         */

        Person person=new Person("成jj");
        person.heartJump();


    }
}

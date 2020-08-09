package com.school.innerClass;

/**
 * @author chengjinging
 * @date 2020/8/9 上午10:09
 *
 *
 *
 * 局部内部类的使用
 */
public class Car {
    public void run(){

        System.out.println("准备开跑。。。");

        class Engine{

            public void fire(){
                System.out.println("发动机点火启动。。。");
            }
        }
        Engine engine=new Engine();
        engine.fire();

    }

    public static void main(String[] args) {
        Car car= new Car();
        car.run();
    }




}

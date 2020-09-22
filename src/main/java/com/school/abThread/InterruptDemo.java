package com.school.abThread;

/**
 * @author chengjinging
 * @date 2020/9/14 下午6:03
 */
public class InterruptDemo {
    static volatile int a=0;
    public static void main(String[] args) {


        Thread thread=new Thread(() ->{
            while (true){
                a++;
                System.out.println("a++      ==="+a);
                if(a>20000 || a<-20000){
                    break;
                }
            }

            }
        );
        Thread thread2=new Thread(() ->{


            System.out.println("a--      ==="+a);
            while (true){
                a--;;
                System.out.println("a--      ==="+a);
                if(a>20000 || a<-20000){
                    break;
                }
            }

        }
        );

        thread.start();
        thread2.start();



    }
}

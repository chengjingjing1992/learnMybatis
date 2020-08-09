package com.school.innerClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 * @author chengjinging
 * @date 2020/8/9 上午10:31
 *
 * 局部内部类期望访问所在方法的局部变量
 */
public class Boat {

    public void dirve(){
        final int a=100;

        class Engine{
            public void jiayouBeforeDrive(){
                System.out.println("加油" + a +"  升");
            }
        }
        Engine engine=new Engine();
        engine.jiayouBeforeDrive();
    }

    public static void main(String[] args) {
        Boat boat=new Boat();
        boat.dirve();
    }
}

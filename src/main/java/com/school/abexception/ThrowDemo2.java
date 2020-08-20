package com.school.abexception;

import com.school.abReflection.Person;

import java.io.FileNotFoundException;

/**
 * @author chengjinging
 * @date 2020/8/19 上午7:50
 */
public class ThrowDemo2 {

    public static void main(String[] args) throws ClassNotFoundException {//调用方再向上抛出就是交给jvm 做中断处理
         /**  如果 被调用的方法向上抛出异常，调用方必须处理异常
         */
        readFile("");
    }



    public static void readFile(String path) throws ClassNotFoundException {
        if(!path.startsWith("c:")){
            /** ClassNotFoundException 这样编译期异常需要再向上抛出
             */
            throw new ClassNotFoundException("文件未找到");

        }
    }
}

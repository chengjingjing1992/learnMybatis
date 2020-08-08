package com.school.abexception;

import java.io.FileNotFoundException;

/**
 * @author chengjinging
 * @date 2020/8/8 下午7:19
 */
public class ExcepionAndError {

    public void error(){
        throw new StackOverflowError();
    }
    public void runtimeExcepion(){
        throw new RuntimeException();
    }
    public void checkedException() throws FileNotFoundException {
        /**
         * 抛出给上一级
         */
        throw new FileNotFoundException();
    }
    public void checkedException2()  {
        /**
         * 自己处理
         */
        try {
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        ExcepionAndError excepionAndError=new ExcepionAndError();
//        excepionAndError.error();
//        excepionAndError.runtimeExcepion();
//        excepionAndError.checkedException();//这里作为上一级必须处理 否则报红
        excepionAndError.checkedException2();
    }

}

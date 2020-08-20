package com.school.abproxy;

/**
 * @author chengjinging
 * @date 2020/8/18 上午7:54
 */
public class Test {

    public static void main(String[] args) {
        Girl wangmeili= new Wangmeili();
        WangmeiliProxy family= new WangmeiliProxy(wangmeili);
        Girl mother=(Girl)family.getProxyInstance();
        mother.say();
        mother.watchMovie();
    }
}

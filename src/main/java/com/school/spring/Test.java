package com.school.spring;

/**
 * @author chengjinging
 * @date 2020/8/13 上午12:12
 */
public class Test {

    public static void main(String[] args) {

        Eletricity eletr=new EletricityErBaiImpl();

        Factory factory=new Factory();
        factory.setEletricity(eletr);
        factory.youdian();
        Company company=new Company();
        company.setEletricity(eletr);
        company.youdian();
        University university=new University();
        university.setEletricity(eletr);
        university.youdian();

    }
}

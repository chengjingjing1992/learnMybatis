package com.school.abReflection;

import com.school.spring.Factory;

/**
 * @author chengjinging
 * @date 2020/8/20 下午11:46
 */
public class Demo4 {
    public static void main(String[] args) {
        FactoryClass factoryClass=new FactoryClassImpl();
        SaleBusiness saleBusiness=new SaleBusiness(factoryClass);
        FactoryClass factory= (FactoryClass) saleBusiness.getInstance();
        factory.getComputer();
    }
}

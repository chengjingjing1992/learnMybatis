package com.school.abReflection;

/**
 * @author chengjinging
 * @date 2020/8/20 下午11:58
 */
public class FactoryClassImpl implements FactoryClass{
    @Override
    public void getComputer() {
        System.out.println("卖电脑。。。");
    }
}

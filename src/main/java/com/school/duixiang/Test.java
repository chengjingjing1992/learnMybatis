package com.school.duixiang;

/**
 * @author chengjinging
 * @date 2020/8/8 下午3:01
 */
public class Test {

    public static void main(String[] args) {
        Career career=new Person();
        career.getSalary();
        career.getCarrerName();
        FamilyRole familyRole=new Person();
        familyRole.getRoleName();
        Person person=new Person();
        person.getCarrerName();
        person.getSalary();
        person.getRoleName();
        person.run();
        person.weight="60kg";
        person.high="2米";


    }
}

package com.school.objectNoName;

/**
 * @author chengjinging
 * @date 2020/8/9 下午2:00
 *
 *匿名对象用完就是垃圾会被回收，非匿名对应的 对象名称引用类型会存在栈内存，
 * 对于只用一个的对象通过 匿名对于可以合理利用内存资源
 */
public class Student {


    public void getHeadmaster(){
        System.out.println("校长是 张某某");
    }

    public void getTeacher(Teacher teacher){
        System.out.println();
    }

    public static void main(String[] args) {

        new Student().getHeadmaster();
    }

}

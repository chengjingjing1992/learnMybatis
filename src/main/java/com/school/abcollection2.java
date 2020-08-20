package com.school;

import com.school.ablamba.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/8/13 上午11:07
 */
public class abcollection2 {

    public static void main(String[] args) {
        Person [] persons=new Person[]{
                new Person("zhangsan",33),
                new Person("lisi",20),
                new Person("wangwu",24)
        };

        List<Person> personList= Arrays.asList(persons);
        System.out.println(personList.toString());

        Person [] ps= (Person[]) personList.toArray();
        System.out.println(Arrays.toString(ps));

        Arrays.sort(ps, (Person o1, Person o2)-> {
                return o2.getAge() - o1.getAge();
            }
        );
        System.out.println(Arrays.toString(ps));



        ArrayList al=new ArrayList<>();

        al.add(false);
        System.out.println(al.toString());











    }
}

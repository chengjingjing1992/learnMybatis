package com.school.abjava8;

import net.sf.json.util.JSONUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/9/12 下午3:27
 */
public class demo1 {


    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                        new Employee("zhangsan", 500),
                        new Employee("lisi", 400),
                        new Employee("wangwu", 200),
                        new Employee("zhaoliu", 399)



        );
        employees.stream()
                .filter((e)->e.getSalayr()<400)
                .forEach(System.out::println);
        employees.forEach(System.out::println);

    }

}

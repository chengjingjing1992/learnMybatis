package com.school.springdemo;

import net.sf.json.util.JSONUtils;

/**
 * @author chengjinging
 * @date 2020/9/13 下午12:40
 */
public class Boss {
    private String bossName;
    private Integer age;

    public Boss(String bossName, Integer age) {
        this.bossName = bossName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossName='" + bossName + '\'' +
                ", age=" + age +
                '}';
    }
}

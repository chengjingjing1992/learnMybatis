package com.school.abcollection;

import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/14 下午11:00
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

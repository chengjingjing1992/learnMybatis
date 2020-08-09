package com.school.hash;

import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/9 下午3:14
 */
public class Floor {


    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Floor floor = (Floor) o;
        return Objects.equals(color, floor.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

package com.school.hash;

import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/9 下午3:01
 */
public class Chair {

    private String color;
    private String weight;
    private String high;
    private String length;

    public Chair(String color, String weight, String high, String length) {
        this.color = color;
        this.weight = weight;
        this.high = high;
        this.length = length;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Objects.equals(color, chair.color) &&
                Objects.equals(weight, chair.weight) &&
                Objects.equals(high, chair.high) &&
                Objects.equals(length, chair.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, high, length);
    }
}

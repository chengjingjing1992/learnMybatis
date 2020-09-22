package com.school.abjava8;

/**
 * @author chengjinging
 * @date 2020/9/12 下午3:26
 */
public class Employee {
    private String name;
    private double salayr;

    public Employee(String name, double salayr) {
        this.name = name;
        this.salayr = salayr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalayr() {
        return salayr;
    }

    public void setSalayr(double salayr) {
        this.salayr = salayr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salayr=" + salayr +
                '}';
    }
}

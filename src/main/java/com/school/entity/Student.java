package com.school.entity;

public class Student {
    private Integer id ;
    private String name;
    private Integer age;
    private Integer classesid;
    private Classes classes;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassesid() {
        return classesid;
    }

    public void setClassesid(Integer classesid) {
        this.classesid = classesid;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}

package com.school.entity;

import java.util.List;

public class Classes {
    private Integer id;
    private String classesName;
    private List<Student> students;

    public Classes() {

    }

    public Classes(Integer id, String classesName, List<Student> students) {
        this.id = id;
        this.classesName = classesName;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

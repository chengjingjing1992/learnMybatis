package com.school.springdemo;

/**
 * @author chengjinging
 * @date 2020/9/13 上午11:11
 */
public class Teacher {

    private String name;
    private String project;

    public Teacher() {
    }

    public Teacher(String name, String project) {
        this.name = name;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}

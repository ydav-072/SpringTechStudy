package com.springApp.studyProj.firstLesson.BeanScope;

public class Cat implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}

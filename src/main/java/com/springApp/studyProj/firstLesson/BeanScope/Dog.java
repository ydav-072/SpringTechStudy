package com.springApp.studyProj.firstLesson.BeanScope;

public class Dog implements Pet {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    //access modifier init & destroy maybe anyone: public, private, protected, default
    //same return type maybe anyone, but we can't use this data and usually marked VOID
    public void init(){
        System.out.println("Class Dog: init method");
    }

    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}

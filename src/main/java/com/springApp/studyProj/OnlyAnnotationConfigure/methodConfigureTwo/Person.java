package com.springApp.studyProj.OnlyAnnotationConfigure.methodConfigureTwo;

import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    private Pet pet;
    private String surName;
    private int age;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

package com.springApp.studyProj.AnnotationConfigure;

import com.springApp.studyProj.firstLesson.DIOtherValue.Pet;

public class Person {
    private com.springApp.studyProj.firstLesson.DIOtherValue.Pet pet;
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

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
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

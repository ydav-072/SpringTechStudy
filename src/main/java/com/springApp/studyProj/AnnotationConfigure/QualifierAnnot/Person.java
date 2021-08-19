package com.springApp.studyProj.AnnotationConfigure.QualifierAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
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
// DI by Constructor
    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    //DI BySetter
//    @Autowired
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set pet");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

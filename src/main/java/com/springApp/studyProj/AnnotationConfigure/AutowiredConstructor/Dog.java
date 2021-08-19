package com.springApp.studyProj.AnnotationConfigure.AutowiredConstructor;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}

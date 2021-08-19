package com.springApp.studyProj.OnlyAnnotationConfigure.annotationValue;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog destroy");
    }
}

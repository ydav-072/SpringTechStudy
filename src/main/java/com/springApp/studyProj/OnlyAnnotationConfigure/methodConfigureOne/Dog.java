package com.springApp.studyProj.OnlyAnnotationConfigure.methodConfigureOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
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

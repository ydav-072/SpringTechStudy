package com.springApp.studyProj.AnnotationConfigure.QualifierAnnot;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}

package com.springApp.studyProj.AnnotationConfigure.QualifierAnnot;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}

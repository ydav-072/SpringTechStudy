package com.springApp.studyProj.AnnotationConfigure.AutowiredConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotation.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}

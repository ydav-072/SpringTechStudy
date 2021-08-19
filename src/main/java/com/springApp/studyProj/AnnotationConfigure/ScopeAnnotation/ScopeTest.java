package com.springApp.studyProj.AnnotationConfigure.ScopeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextQualifier.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog yourDog = context.getBean("dogBean", Dog.class);
        myDog.say();
        System.out.println("Is this one object? " + (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        context.close();
    }
}

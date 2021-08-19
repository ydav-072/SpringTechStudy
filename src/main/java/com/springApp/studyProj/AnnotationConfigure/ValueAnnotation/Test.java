package com.springApp.studyProj.AnnotationConfigure.ValueAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextQualifier.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        context.close();
    }
}

package com.springApp.studyProj.AnnotationConfigure.AutowiredBySetterAndField;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotSetter.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}

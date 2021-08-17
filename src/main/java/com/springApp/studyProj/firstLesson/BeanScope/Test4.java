package com.springApp.studyProj.firstLesson.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();

        context.close();
    }
}

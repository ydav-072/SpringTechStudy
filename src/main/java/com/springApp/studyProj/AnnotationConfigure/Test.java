package com.springApp.studyProj.AnnotationConfigure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotation.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
    }
}

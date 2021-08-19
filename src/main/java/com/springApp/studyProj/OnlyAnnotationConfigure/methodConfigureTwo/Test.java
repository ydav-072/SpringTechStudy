package com.springApp.studyProj.OnlyAnnotationConfigure.methodConfigureTwo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}

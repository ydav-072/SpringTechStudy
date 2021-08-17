package com.springApp.studyProj.firstLesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // declaration appContext for spring framework with xml config
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = classPathXmlApplicationContext.getBean("myPet", Pet.class); //Pet.class because its make possible create various obj
        pet.say();

        classPathXmlApplicationContext.close(); // always need close appContext
    }
}

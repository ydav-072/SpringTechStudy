package com.springApp.studyProj.firstLesson.DIOtherValue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet(); it's old

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        context.close();
    }
}

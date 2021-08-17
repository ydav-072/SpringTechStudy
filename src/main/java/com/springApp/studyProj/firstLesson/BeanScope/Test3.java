package com.springApp.studyProj.firstLesson.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");

        //singletone
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Kallos");
//        yourDog.setName("Djeki");
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        //prototype
        Cat myCat = context.getBean("myPetCat", Cat.class);
        Cat yourCat = context.getBean("myPetCat", Cat.class);
        myCat.setName("Murzic");
        yourCat.setName("Petros");
        System.out.println(myCat.getName());
        System.out.println(yourCat.getName());

        context.close();
    }
}

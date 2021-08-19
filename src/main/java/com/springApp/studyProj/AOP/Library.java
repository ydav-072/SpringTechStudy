package com.springApp.studyProj.AOP;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook(){
        System.out.println("Get Book");
    }
}

package com.springApp.studyProj.AOP.adviceTypeBefore;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("Get Book");
    }
}

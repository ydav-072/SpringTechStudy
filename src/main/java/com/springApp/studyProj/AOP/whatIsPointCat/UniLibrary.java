package com.springApp.studyProj.AOP.whatIsPointCat;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends  AbstractLibrary{

    public void getBook(){
        System.out.println("Get Book");
    }

    public String returnBook(){
        System.out.println("Return book in library");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("Get magazine in library");
    }
}

package com.springApp.studyProj.AOP.pointCutPriority;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Get Book");
    }

    public void addBook(){
        System.out.println("Add Book");
    }

    public void returnBook(){
        System.out.println("Return book in library");
        //return "OK";
    }

    public void getMagazine(){
        System.out.println("Get magazine in library");
    }

    public void addMagazine(){
        System.out.println("Add Magazine");
    }

    public void returnMagazine(){
        System.out.println("Return magazine in library");
    }
}

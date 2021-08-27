package com.springApp.studyProj.AOP.aroundAdvice;

import com.springApp.studyProj.AOP.joinPoint.AbstractLibrary;
import com.springApp.studyProj.AOP.joinPoint.Book;
import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Get Book");
        System.out.println("_____________________________________________");
    }

    public void addBook(String personName, Book book){
        System.out.println("Add Book");
        System.out.println("_____________________________________________");
    }

    public String returnBook(){
        System.out.println("Return book in library");
        return "BookName";
    }

    public void getMagazine(){
        System.out.println("Get magazine in library");
        System.out.println("_____________________________________________");
    }

    public void addMagazine(){
        System.out.println("Add Magazine");
        System.out.println("_____________________________________________");
    }

    public void returnMagazine(){
        System.out.println("Return magazine in library");
        System.out.println("_____________________________________________");
    }
}

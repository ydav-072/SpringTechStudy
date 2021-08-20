package com.springApp.studyProj.AOP.joinPoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Game of thrones")
    private String name;

    @Value("George R. R. Martin")
    private String author;

    @Value("1996")
    private int yearOfPublication;

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }
}

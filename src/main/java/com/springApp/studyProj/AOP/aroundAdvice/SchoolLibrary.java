package com.springApp.studyProj.AOP.aroundAdvice;

import com.springApp.studyProj.AOP.joinPoint.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Get SchoolBook");
    }
}

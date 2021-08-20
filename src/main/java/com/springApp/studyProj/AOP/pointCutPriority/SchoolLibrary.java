package com.springApp.studyProj.AOP.pointCutPriority;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Get SchoolBook");
    }
}

package com.springApp.studyProj.AOP.pointCutPriority;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibraryBean", UniLibrary.class);
        library.getBook();
        library.returnBook();
        library.getMagazine();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        schoolLibrary.getBook();

        context.close();
    }
}

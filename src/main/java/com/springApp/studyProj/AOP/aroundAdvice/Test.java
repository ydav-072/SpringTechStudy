package com.springApp.studyProj.AOP.aroundAdvice;


import com.springApp.studyProj.AOP.aroundAdvice.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibraryBean", UniLibrary.class);
        library.returnBook();
        context.close();
    }
}

package com.springApp.studyProj.AOP.pointCutPriority.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    //pointCat for execution advice before getBook
//    @Before("execution(public void getBook())")
//    public void beforeGetAdvice(){
//        System.out.println("Trying to get book advice");
//    }
//pointCat for execution advice before getBook from current Unilibrary
//    @Before("execution(public void com.springApp.studyProj.AOP.whatIsPointCat.UniLibrary.getBook())")
//    public void beforeGetAdvice(){
//        System.out.println("Trying to get book advice");
//    }

//pointCat for execution advice before getBook for all method get*
//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice(){
//        System.out.println("Trying to get book advice");
//    }

    //pointCat for execution advice before getBook with param. All param = ..
//    @Before("execution(public void getBook(String))")
//    public void beforeGetBook(){
//        System.out.println("Trying to get book advice");
//    }

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

//    @Before("execution(* get*())")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("Trying to return book advice");
//    }
//
//    @Before("execution(* get*())")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: check rules");
//    }
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("Trying to get book advice");
    }
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: check rules");
    }
}

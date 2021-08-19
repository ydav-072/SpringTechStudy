package com.springApp.studyProj.AOP.adviceTypeBefore.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //pointCat for execution advice before getBook
    @Before("execution(public void getBook())")
    public void beforeGetAdvice(){
        System.out.println("Trying to get book advice");
    }
}

package com.springApp.studyProj.AOP.aroundAdvice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExceptionHandlingAspect {
    @Before("com.springApp.studyProj.AOP.aroundAdvice.aspects.MyPointcut.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: catch exception when trying to Add book/magazine");
        System.out.println("_____________________________________________");
    }
}

package com.springApp.studyProj.AOP.pointCutPriority.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.springApp.studyProj.AOP.pointCutPriority.aspects.MyPointcut.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: catch exception when trying to get book/magazine");
    }
}

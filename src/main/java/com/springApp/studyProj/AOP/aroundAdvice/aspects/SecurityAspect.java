package com.springApp.studyProj.AOP.aroundAdvice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SecurityAspect {
    @Before("com.springApp.studyProj.AOP.aroundAdvice.aspects.MyPointcut.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: checking rules on Adding book/magazine");
        System.out.println("_____________________________________________");
    }
}

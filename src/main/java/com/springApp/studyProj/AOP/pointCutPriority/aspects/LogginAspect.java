package com.springApp.studyProj.AOP.pointCutPriority.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogginAspect {
    @Before("com.springApp.studyProj.AOP.pointCutPriority.aspects.MyPointcut.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: logging try to get book/magazine");
    }
}

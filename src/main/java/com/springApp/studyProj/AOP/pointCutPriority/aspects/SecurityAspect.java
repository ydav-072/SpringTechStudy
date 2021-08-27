package com.springApp.studyProj.AOP.pointCutPriority.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.springApp.studyProj.AOP.pointCutPriority.aspects.MyPointcut.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: checking rules on getting book/magazine");
    }
}

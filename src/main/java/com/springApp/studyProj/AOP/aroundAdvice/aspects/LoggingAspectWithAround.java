package com.springApp.studyProj.AOP.aroundAdvice.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectWithAround {
    //with @Around we can doing:
//make some work before calling target method
//make some work after calling target method
//get result of work target method and/or change return statement
//and can handling exception if it's throw
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLogginAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("");
        Object targetMethodResult = null;
        try {
            targetMethodResult = joinPoint.proceed();
        }catch (Exception exception){
            System.out.println("aroundReturnBookLogginAdvice catch exception: " + exception);
            //targetMethodResult = "Unknown bookName";
            throw exception;
        }
        System.out.println("aroundReturnBookLogginAdvice: In library return book");
        return targetMethodResult;
    }
}


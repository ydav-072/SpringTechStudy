package com.springApp.studyProj.AOP.whatIsPointCat.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointCatCombination {

    @Pointcut("execution(* com.springApp.studyProj.AOP.whatIsPointCat.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void com.springApp.studyProj.AOP.whatIsPointCat.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void allMethodsExceptReturnMagazine(){
        System.out.println("allMethodsExceptReturnMagazine: Log #4");
    }
}

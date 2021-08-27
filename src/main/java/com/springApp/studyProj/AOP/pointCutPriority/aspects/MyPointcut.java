package com.springApp.studyProj.AOP.pointCutPriority.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}

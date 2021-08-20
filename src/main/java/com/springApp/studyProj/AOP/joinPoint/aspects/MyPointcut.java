package com.springApp.studyProj.AOP.joinPoint.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}
}

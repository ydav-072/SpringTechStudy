package com.springApp.studyProj.AOP.joinPoint.aspects;

import com.springApp.studyProj.AOP.joinPoint.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogginAspect {
    @Before("com.springApp.studyProj.AOP.joinPoint.aspects.MyPointcut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod: " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName: " + methodSignature.getName());

        if(methodSignature.getName().equals(("addBook"))){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("INformation about book: Name = " + myBook.getName() + ", Author = " + myBook.getAuthor());
                }
                else if (obj instanceof String){
                    System.out.println("Book was added : " + obj);
                }
            }
        }



        System.out.println("beforeAddLoggingAdvice: logging try to Add book/magazine");
        System.out.println("_____________________________________________");
    }
}

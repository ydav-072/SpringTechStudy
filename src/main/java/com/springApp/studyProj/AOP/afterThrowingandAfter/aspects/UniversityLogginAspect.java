package com.springApp.studyProj.AOP.afterThrowingandAfter.aspects;

import com.springApp.studyProj.AOP.afterThrowingandAfter.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogginAspect {
    @Before("execution(* getStudentList())")
    public void beforeGetStudentsLogginAdvice(){
        System.out.println("beforeGetStudentsLogginAdvice: logging getting studentList before method getStudentList()");
    }


    //advice afterReturning can catch return from method, work with this data, make changes or other operation,
    // and then passes the value instead of calling the method
    @AfterReturning(pointcut = "execution(* getStudentList())", returning = "studentsList")
    public void afterReturningGetStudentsLogginAdvice(List<Student> studentsList){
        Student firstStudent = studentsList.get(0);
        String nameSurName = firstStudent.getNameSurName();
        nameSurName = "Mr. " + nameSurName;
        firstStudent.setNameSurName(nameSurName);

        double avgMarks = firstStudent.getAvgMark();
        avgMarks = ++avgMarks;
        firstStudent.setAvgMark(avgMarks);

        studentsList.add(0,firstStudent);
        System.out.println("afterReturningGetStudentsLogginAdvice: first student after change is: " + studentsList.get(0));
        System.out.println("afterReturningGetStudentsLogginAdvice: logging getting studentList after method getStudentList()");
    }

    @AfterThrowing(pointcut = "execution(* getStudentList())", throwing = "exception")
    public void afterThrowingGetStudentsLogginAdvice(Throwable exception){
        //we can't processing exception
        System.out.println("afterThrowingGetStudentsLogginAdvice: Logging Exception in getStudentList: " + exception);

    }

    @After("execution(* getStudentList())")
    public void afterGetStudentsLogginAdvice(){
        System.out.println("afterGetStudentsLogginAdvice: Logging normally or exception finish method getStudentList");
    }
}

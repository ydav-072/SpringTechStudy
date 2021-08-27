package com.springApp.studyProj.AOP.afterThrowingandAfter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("universityBean", University.class);

        university.addStudents();
        try {
            List<Student> studentList = university.getStudentList();
            System.out.println("list of all students: " + studentList);
        }catch (Exception exception){
            System.out.println("Catch exception: " + exception);
        }
        context.close();
    }
}

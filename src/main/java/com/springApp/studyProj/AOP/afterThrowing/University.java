package com.springApp.studyProj.AOP.afterThrowing;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudents(){
        Student student = new Student("Alexei Levitsky", 2, 7.1);
        Student student2 = new Student("Anna Levitskaya", 4, 8.7);
        Student student3 = new Student("Matvei", 1, 6.7);
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
    }

    public List<Student> getStudentList(){
        System.out.println("Starting work method getStudentList");
        System.out.println(studentList.get(40));
        System.out.println("Information from method getStudent: ");
        System.out.println(studentList);
        return studentList;
    }
}

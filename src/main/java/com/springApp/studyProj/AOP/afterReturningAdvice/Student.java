package com.springApp.studyProj.AOP.afterReturningAdvice;

public class Student {
    private String nameSurName;
    private int course;
    private double avgMark;

    public Student(String nameSurName, int course, double avgMark) {
        this.nameSurName = nameSurName;
        this.course = course;
        this.avgMark = avgMark;
    }

    public String getNameSurName() {
        return nameSurName;
    }

    public void setNameSurName(String nameSurName) {
        this.nameSurName = nameSurName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurName='" + nameSurName + '\'' +
                ", course=" + course +
                ", avgMark=" + avgMark +
                '}';
    }
}

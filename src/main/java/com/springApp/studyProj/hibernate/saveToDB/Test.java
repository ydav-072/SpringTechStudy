package com.springApp.studyProj.hibernate.saveToDB;

import com.springApp.studyProj.hibernate.saveToDB.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            Employee emp = new Employee("Matvei", "Loban", "three", 1312);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}

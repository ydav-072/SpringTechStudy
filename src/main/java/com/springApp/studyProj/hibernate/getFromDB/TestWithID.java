package com.springApp.studyProj.hibernate.getFromDB;

import com.springApp.studyProj.hibernate.getFromDB.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestWithID {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Anna", "Levitskaya", "sales", 2000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            int myId = emp.getId();
            //get fromDB
            session = factory.getCurrentSession();
            session.beginTransaction(); // start transaction
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit(); // end transaction
            System.out.println(employee);
            System.out.println("Well DONE!");
        }finally {
            factory.close();
        }
    }
}

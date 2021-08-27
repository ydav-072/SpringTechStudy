package com.springApp.studyProj.hibernate.deleteObjFromDB;

import com.springApp.studyProj.hibernate.deleteObjFromDB.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
            session.createQuery("delete Employee where name = 'Matveii'").executeUpdate();
            session.getTransaction().commit();
            System.out.println("Well DONE");
        }finally {
            factory.close();
        }
    }
}

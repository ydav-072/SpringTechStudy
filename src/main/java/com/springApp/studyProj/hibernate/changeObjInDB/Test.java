package com.springApp.studyProj.hibernate.changeObjInDB;


import com.springApp.studyProj.hibernate.changeObjInDB.entity.Employee;
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
            int myID = 1;
//            Employee employee = session.get(Employee.class, myID);
//            employee.setSalary(20000); // change salary for one employee
            session.createQuery("update Employee set salary= 30000 where name = 'Anna'").executeUpdate();//change all employee Anna salary

            session.getTransaction().commit();
            System.out.println("Well DONE");
        }finally {
            factory.close();
        }
    }
}

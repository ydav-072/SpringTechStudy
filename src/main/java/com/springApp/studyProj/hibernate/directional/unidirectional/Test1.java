package com.springApp.studyProj.hibernate.directional.unidirectional;

import com.springApp.studyProj.hibernate.directional.unidirectional.entity.Details;
import com.springApp.studyProj.hibernate.directional.unidirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Alexei123123", "Levitsky", "IT", 2000);
            Details details2 = new Details("Borisov534313", "+375297878787", "loban@matv.net");

            employee.setDetails(details2);
            details2.setEmployee(employee);
            session.beginTransaction();

            session.save(details2);

            System.out.println("_____________________________________________________");
            Employee emp = session.get(Employee.class, 1);

            System.out.println(emp.getDetails());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
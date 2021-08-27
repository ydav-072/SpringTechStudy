package com.springApp.studyProj.hibernate.directional.unidirectional;

import com.springApp.studyProj.hibernate.directional.unidirectional.entity.Details;
import com.springApp.studyProj.hibernate.directional.unidirectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Alexei", "Levitsky", "IT", 2000);
            Employee employee2 = new Employee("Anna", "Levitskaya", "IT", 2500);
            Employee employee3 = new Employee("Matvei", "Loban", "IT", 2300);
            Details details = new Details("Minsk", "+375295551688", "ydav-07@mail.ru");
            Details details1 = new Details("Minsk", "+375295661057", "alevi199@gmail.com");
            Details details2 = new Details("Borisov", "+375297878787", "loban@matv.net");

            employee.setDetails(details);
            employee2.setDetails(details1);
            employee3.setDetails(details2);

            session.beginTransaction();

            session.save(employee);
            session.save(employee2);
            session.save(employee3);

            System.out.println("_____________________________________________________");
            Employee emp = session.get(Employee.class, 1);

            System.out.println(emp.getDetails());

            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}

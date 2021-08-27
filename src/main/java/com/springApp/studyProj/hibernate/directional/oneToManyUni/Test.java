package com.springApp.studyProj.hibernate.directional.oneToManyUni;

import com.springApp.studyProj.hibernate.directional.oneToManyUni.entity.Departments;
import com.springApp.studyProj.hibernate.directional.oneToManyUni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Departments.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

            Departments departments = new Departments("HR", 900,400);
            Employee employee = new Employee("Vorona", "Kazzka", 600);
            Employee employee1 = new Employee("Jul", "Genry", 555);
            departments.addEmployeeToDepartment(employee);
            departments.addEmployeeToDepartment(employee1);

            session.beginTransaction();

            session.save(departments);

            session.getTransaction().commit();
            System.out.println("Well DONE!!!!!!!!");
        }finally {
            session.close();
            factory.close();
        }
    }
}

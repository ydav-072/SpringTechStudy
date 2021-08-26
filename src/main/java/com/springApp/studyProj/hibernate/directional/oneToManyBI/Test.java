package com.springApp.studyProj.hibernate.directional.oneToManyBI;

import com.springApp.studyProj.hibernate.directional.oneToManyBI.entity.Departments;
import com.springApp.studyProj.hibernate.directional.oneToManyBI.entity.Employee;
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

//            Departments departments = new Departments("IT", 300, 3000);
//            Employee employee1 = new Employee("Alexei", "Levitsky", 800);
//            Employee employee2 = new Employee("Matvei", "Loban", 450);
//            departments.addEmployeeToDepartment(employee1);
//            departments.addEmployeeToDepartment(employee2);
            session.beginTransaction();

            Departments departments = session.get(Departments.class, 4);
            System.out.println(departments);
            System.out.println(departments.getEmployeeList());
//            session.save(departments);

            session.getTransaction().commit();
            System.out.println("Well DONE!!!!!!!!");
        }finally {
            session.close();
            factory.close();
        }
    }
}

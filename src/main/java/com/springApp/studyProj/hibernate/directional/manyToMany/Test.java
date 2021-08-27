package com.springApp.studyProj.hibernate.directional.manyToMany;

import com.springApp.studyProj.hibernate.directional.manyToMany.entity.Child;
import com.springApp.studyProj.hibernate.directional.manyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class).addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

            Section section = new Section("Football");
            Child child = new Child("Alexei", 12);
            Child child1 = new Child("Matvei", 13);
            Section section1 = new Section("Dance");
            Child child2 = new Child("Anna", 10);
            Section section2 = new Section("Music");

            section.addChildToSection(child);
            section.addChildToSection(child1);

            section1.addChildToSection(child1);

            section2.addChildToSection(child);
            section2.addChildToSection(child2);

            session.beginTransaction();

            session.persist(section);//==save
            session.persist(section2);
            session.persist(section1);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}

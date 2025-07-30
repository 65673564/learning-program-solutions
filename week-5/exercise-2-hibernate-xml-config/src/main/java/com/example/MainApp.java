package com.example;

import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Save
            Student s1 = new Student("Raji", "raji@gmail.com");
            session.save(s1);

            // Read all
            List<Student> students = session.createQuery("FROM Student", Student.class).list();
            students.forEach(s -> System.out.println(s.getId() + " - " + s.getName()));

            // Read one
            Student s = session.get(Student.class, s1.getId());
            System.out.println("Fetched: " + s.getName());

            // Delete
            session.delete(s);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

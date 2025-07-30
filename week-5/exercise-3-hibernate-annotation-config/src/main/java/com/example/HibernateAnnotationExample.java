package com.example;

import com.example.model.Employee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateAnnotationExample {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Save new employee
            Employee emp = new Employee("Raji", "Developer");
            session.save(emp);

            // Fetch employee
            Employee fetched = session.get(Employee.class, emp.getId());
            System.out.println("Fetched: " + fetched.getName() + " - " + fetched.getRole());

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

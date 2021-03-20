package com.anupam;

import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Application {



    public static void savePerson (Person person){
        Configuration config = new Configuration().configure().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
    }

    public static Person getPerson(String ssn){
        var config = new Configuration().configure().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        var person = session.get(Person.class, ssn);
        transaction.commit();
        return person;
    }
}

package com.anupam;

import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Application {
    public static void save (Object object){
        var config = new Configuration().configure().addAnnotatedClass(object.getClass());
        var sessionFactory = config.buildSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
    }

    public static Object getByPrimaryKey(Object clazz, int primaryKey){
        var config = new Configuration().configure().addAnnotatedClass(clazz.getClass());
        var sessionFactory = config.buildSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();
        var results = session.get(clazz.getClass(), primaryKey);
        transaction.commit();
        return results;
    }
}

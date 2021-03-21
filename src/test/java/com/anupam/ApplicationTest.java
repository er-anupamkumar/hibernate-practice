package com.anupam;


import lombok.var;
import org.hibernate.cfg.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

    @Test
    public void should_save() {
        Person person = new Person("125","Anupam","anand","241095");
        Laptop laptop = new Laptop(10001,"Dell");
        Student student = new Student(1120011,"Anupam",90,laptop);
        var config = new Configuration().configure().addAnnotatedClass(student.getClass());
        var sessionFactory = config.buildSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }
/*    @Test
    public void should_display_participants() {
        Person person = Application.getPerson("124");
        System.out.println(person);
        Assert.assertEquals("Shubhu",person.getFirstname());
    }*/
}

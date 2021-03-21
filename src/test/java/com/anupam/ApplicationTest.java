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
        //Person person = new Person(1387653012,"SSSSAnupam","anand","241095");
        Laptop laptop = new Laptop(10003,"Dell");
        Student student = new Student();
        student.setRollNumber(123456799);
        student.setName("Anupam1");
        student.setMarks(90);
        student.getLaptops().add(laptop);
        //student.setPerson(person);
        var config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        var sessionFactory = config.buildSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }
/*    @Test
    public void should_display_participants() {
        Person person = Application.getPerson("124");
        System.out.println(person);
        Assert.assertEquals("Shubhu",person.getFirstname());
    }*/
}

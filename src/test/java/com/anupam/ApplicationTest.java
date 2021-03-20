package com.anupam;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

/*    static List<Person> participants= new ArrayList<Person>();

    @BeforeClass
    public void setup(){
        participants.add(new Person("123","Anupam","kumar","130788"));
        participants.add(new Person("124","Shubhu","anand","241095"));
        participants.add(new Person("125","richa","srivastava","130788"));
        participants.add(new Person("126","ankita","sri","050192"));
        for (Person entry:participants){
            Application.savePerson(entry);
        }
    }*/


    @Test
    public void should_save_participants() {
        Person person = Application.getPerson("124");
        System.out.println(person);
        Assert.assertEquals("Shubhu",person.getFirstname());
    }

}

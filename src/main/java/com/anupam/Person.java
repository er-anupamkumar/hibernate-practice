package com.anupam;

import lombok.Data;

import javax.persistence.*;
import java.util.Random;

//@Entity(name = "Persion_Table")
@Data
@Entity
@Table(name = "Person_Table")
public class Person {
    @Id
    @Column(name = "p_ssn")
    private String ssn;
    @Column(name = "p_fname")
    private String firstname;
    @Column(name = "p_lname")
    private String lastname;
    @Column(name = "p_dob")
    private String dob;
    //@Transient
    //private int ssnTrace;
    public Person(String ssn, String firstname, String lastname, String dob) {
        this.dob = dob;
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}

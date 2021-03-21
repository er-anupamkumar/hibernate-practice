package com.anupam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Random;

//@Entity(name = "Persion_Table")
@Data
@Entity
@Table(name = "Person_Table")
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id @Column(name = "p_ssn")
    private int ssn;
    @Column(name = "p_fname")
    private String firstname;
    @Column(name = "p_lname")
    private String lastname;
    @Column(name = "p_dob")
    private String dob;
}

package com.anupam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private int rollNumber;
    private String name;
    private int marks;
    @OneToMany List<Laptop> laptops = new ArrayList<Laptop>();
    //@OneToOne Person person;
}

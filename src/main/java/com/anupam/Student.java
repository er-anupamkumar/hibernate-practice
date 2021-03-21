package com.anupam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private int rollNumber;
    private String name;
    private int marks;
    @OneToOne(mappedBy = "laptop") Laptop laptop;
}

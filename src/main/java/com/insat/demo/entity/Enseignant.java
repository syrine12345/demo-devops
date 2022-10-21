package com.insat.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    public String id;
    public String firstname;
    public String lastname;

    public Enseignant (String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

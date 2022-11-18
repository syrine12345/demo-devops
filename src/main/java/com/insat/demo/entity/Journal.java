package com.insat.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Journal implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private String name;
    private String address;
    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    private Journaliste journaliste;

    public Journal(String name, String address, Journaliste journaliste) {
        this.name = name;
        this.address = address;
        this.journaliste = journaliste;
    }

    public Journal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Journaliste getJournaliste() {
        return journaliste;
    }

    public void setJournaliste(Journaliste journaliste) {
        this.journaliste = journaliste;
    }
}

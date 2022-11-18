package com.insat.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Numero implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private String date;
    private String tirage;

    public Numero(String date, String tirage) {
        this.date = date;
        this.tirage = tirage;
    }

    public Numero(){}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTirage() {
        return tirage;
    }

    public void setTirage(String tirage) {
        this.tirage = tirage;
    }

}

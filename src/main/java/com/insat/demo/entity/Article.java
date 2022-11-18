package com.insat.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Numero n0;
    private String content;

    public Article(Numero n0, String content) {
        this.n0 = n0;
        this.content = content;
    }

    public Article(){}

    public Numero getNumero() {
        return n0;
    }

    public void setNumero(Numero n0) {
        this.n0 = n0;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

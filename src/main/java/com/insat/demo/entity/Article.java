package com.insat.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    private Journaliste journaliste;

    public Article(String content, Journaliste journaliste) {
        this.content = content;
        this.journaliste = journaliste;
    }

    public Article(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Journaliste getJournaliste() {
        return journaliste;
    }

    public void setJournaliste(Journaliste journaliste) {
        this.journaliste = journaliste;
    }

}

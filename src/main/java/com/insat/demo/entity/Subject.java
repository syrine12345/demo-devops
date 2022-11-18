package com.insat.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "label")
    private String label;

    @OneToMany(mappedBy = "subject")
    private List<Article> articleList = new ArrayList<>();

    public Subject(long id, String label, List articleList) {
        this.id = id;
        this.label = label;
        this.articleList = articleList;
    }

    public Subject(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List getArticleList() {
        return articleList;
    }

    public void setArticleList(List articleList) {
        this.articleList = articleList;
    }
}

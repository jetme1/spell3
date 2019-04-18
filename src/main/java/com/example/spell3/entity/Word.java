package com.example.spell3.entity;

import javax.persistence.*;

@Entity
@Table(name = "allword")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name="word")
    private String allWords;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAllWords() {
        return allWords;
    }

    public void setAllWords(String allWords) {
        this.allWords = allWords;
    }


    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", allWords='" + allWords + '\'' +
                '}';
    }
}

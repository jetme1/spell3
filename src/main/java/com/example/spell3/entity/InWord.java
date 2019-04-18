package com.example.spell3.entity;

import javax.persistence.*;

@Entity
@Table(name = "inword")
public class InWord {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinword")
    private Long idInWord;



    @Column(name = "inputword")
    private String inputWord;


    public Long getIdInWord() {
        return idInWord;
    }
    public void setIdInWord(Long idInWord) {
        this.idInWord = idInWord;
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    @Override
    public String toString() {
        return "InWord{" +
                "idInWord=" + idInWord +
                ", inputWord='" + inputWord + '\'' +
                '}';
    }
}

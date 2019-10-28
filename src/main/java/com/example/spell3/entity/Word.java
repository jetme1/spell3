package com.example.spell3.entity;

import javax.persistence.*;

@Entity
@Table(name = "allword")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "five_length")
    private String fiveLength;
    @Column(name = "six_length")
    private String sixLength;
    @Column(name = "seven_length")
    private String sevenLength;
    @Column(name = "eight_length")
    private String eightLength;
    @Column(name = "nine_length")
    private String nineLength;
    @Column(name = "ten_length")
    private String tenLength;
    @Column(name = "eleven_length")
    private String elevenLength;
    @Column(name = "twelve_length")
    private String twelveLength;
    @Column(name = "thirteen_length")
    private String thirteenLength;
    @Column(name = "fourteen_length")
    private String fourteenLength;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFiveLength() {
        return fiveLength;
    }

    public void setFiveLength(String fiveLength) {
        this.fiveLength = fiveLength;
    }

    public String getSevenLength() {
        return sevenLength;
    }

    public void setSevenLength(String sevenLength) {
        this.sevenLength = sevenLength;
    }

    public String getEightLength() {
        return eightLength;
    }

    public void setEightLength(String eightLength) {
        this.eightLength = eightLength;
    }

    public String getNineLength() {
        return nineLength;
    }

    public void setNineLength(String nineLength) {
        this.nineLength = nineLength;
    }

    public String getTenLength() {
        return tenLength;
    }

    public void setTenLength(String tenLength) {
        this.tenLength = tenLength;
    }

    public String getElevenLength() {
        return elevenLength;
    }

    public void setElevenLength(String elevenLength) {
        this.elevenLength = elevenLength;
    }

    public String getTwelveLength() {
        return twelveLength;
    }

    public void setTwelveLength(String twelveLength) {
        this.twelveLength = twelveLength;
    }

    public String getThirteenLength() {
        return thirteenLength;
    }

    public void setThirteenLength(String thirteenLength) {
        this.thirteenLength = thirteenLength;
    }

    public String getFourteenLength() {
        return fourteenLength;
    }

    public void setFourteenLength(String fourteenLength) {
        this.fourteenLength = fourteenLength;
    }

    public String getSixLength() {
        return sixLength;
    }

    public void setSixLength(String sixLength) {
        this.sixLength = sixLength;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", fiveLength='" + fiveLength + '\'' +
                ", sixLength='" + sixLength + '\'' +
                ", sevenLength='" + sevenLength + '\'' +
                ", eightLength='" + eightLength + '\'' +
                ", nineLength='" + nineLength + '\'' +
                ", tenLength='" + tenLength + '\'' +
                ", elevenLength='" + elevenLength + '\'' +
                ", twelveLength='" + twelveLength + '\'' +
                ", thirteenLength='" + thirteenLength + '\'' +
                ", fourteenLength='" + fourteenLength + '\'' +
                '}';
    }
}

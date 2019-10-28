package com.example.spell3.entity;

public class MissedWord {

    private String missedWord;


    public String getMissedWord() {
        return missedWord;
    }

    public void setMissedWord(String missedWord) {
        this.missedWord = missedWord;
    }

    @Override
    public String toString() {
        return "MissedWord{" +
                "missedWord='" + missedWord + '\'' +
                '}';
    }
}

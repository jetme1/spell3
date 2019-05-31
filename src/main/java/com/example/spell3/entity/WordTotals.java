package com.example.spell3.entity;

public class WordTotals {

    private Long numberRight;
    private Long totalWords;

    public WordTotals(Long numberRight, Long totalWords) {
        this.numberRight = numberRight;
        this.totalWords = totalWords;
    }

    public Long getNumberRight() {
        return numberRight;
    }

    public void setNumberRight(Long numberRight) {
        this.numberRight = numberRight;
    }

    @Override
    public String toString() {
        return "WordTotals{" +
                "numberRight=" + numberRight +
                ", totalWords=" + totalWords +
                '}';
    }
}

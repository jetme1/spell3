package com.example.spell3.entity;

public class WordRouter {

    private WordLength wordLength = WordLength.FOUR;

    public WordLength getWordLength() {
        return wordLength;
    }

    public void setWordLength(WordLength wordLength) {
        this.wordLength = wordLength;
    }


    @Override
    public String toString() {
        return "WordRouter{" +
                "wordLength=" + wordLength +
                '}';
    }
}

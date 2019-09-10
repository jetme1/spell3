package com.example.spell3.entity;

public class WordRouter {

    private WordLength wordLength = WordLength.SEVEN;


    public WordRouter(WordLength wordLength){
       this.wordLength =wordLength;
    }


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

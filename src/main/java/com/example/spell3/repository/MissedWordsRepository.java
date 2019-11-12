package com.example.spell3.repository;

import com.example.spell3.entity.MissedWord;
import com.example.spell3.entity.Word;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//todo add interface
@Repository
public class MissedWordsRepository {
    //todo add interface
    private List<MissedWord> missedWords = new ArrayList<>();

    public MissedWordsRepository() {
        super();
    }

    public List<MissedWord> findAll() {
        return new ArrayList<MissedWord>(this.missedWords);
    }

    public void add(MissedWord missedWord) {
        System.out.println("before MissedWordsRepository add " +
                missedWords + "missedWord is " + missedWord);
        this.missedWords.add(missedWord);
        System.out.println("in MissedWordsRepository add " +
                missedWords);
    }

    public void clearMissedWords() {
        missedWords.clear();

    }
}

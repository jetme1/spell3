package com.example.spell3.service;

import com.example.spell3.entity.MissedWord;
import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;

import java.util.List;

public interface MissedWordService {

    public List<MissedWord> findAll();
    public void add(final MissedWord missedWord, Word word, WordLength wordLength);
    public void clearMissedWords();


    }

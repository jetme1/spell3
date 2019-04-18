package com.example.spell3.service;

import com.example.spell3.entity.Word;
import com.example.spell3.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {

    private WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }


    @Override
    public Word findById(Long theId) {
        Optional<Word> result = wordRepository.findById(theId);

        Word theWord = null;

        if (result.isPresent()) {
            theWord = result.get();
        } else {
            throw new RuntimeException("Did not find id - " + theId);

        }
        return theWord;
    }
}

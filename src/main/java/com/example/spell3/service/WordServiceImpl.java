package com.example.spell3.service;

import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;
import com.example.spell3.entity.WordRouter;
import com.example.spell3.exceptions.NotFoundException;
import com.example.spell3.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {
    WordRouter wordRouter;
    private WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }


    @Override
    public Word findById(Long theId, WordRouter wordRouter) {
        System.out.println("in WordService findById long "+wordRouter);
        Optional<Word> result = wordRepository.findById(theId);
//WordRouter emuInfo = new WordRouter();
       this.wordRouter=wordRouter;
         //  System.out.println("in WordService " + emuInfo.getWordLength());


        Word theWord = null;

        if (result.isPresent()) {
            theWord = result.get();

        } else {
            throw new NotFoundException("ID Not Found. For ID value:  " + theId.toString()+ " email website owner" );

        }
        System.out.println("in Word long findbyId " +theWord);
        return theWord;
    }

    @Override
    public Word findById(Long theId) {
        Optional<Word> result = wordRepository.findById(theId);
//WordRouter emuInfo = new WordRouter();

       System.out.println("in WordService findById short "+wordRouter);
        Word theWord = null;

        if (result.isPresent()) {
            theWord = result.get();

        } else {
            throw new NotFoundException("ID Not Found. For ID value:  " + theId.toString()+ " email website owner" );

        }
        System.out.println("in WordService findById short theWord "+theWord);
        return theWord;
    }



}

package com.example.spell3.service;

import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
import org.springframework.stereotype.Service;

@Service
public class CompareWordServiceImpl implements CompareWordService{


    @Override
    public boolean compare(Word theWord, InWord theInWord ) {


      if (theWord.getAllWords().equalsIgnoreCase(theInWord.getInputWord())) {
          return true;
      }

      else return false;


    }


}

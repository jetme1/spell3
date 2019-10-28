package com.example.spell3.service;

import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;
import com.example.spell3.entity.WordRouter;

public interface CompareWordService {


 //   public boolean compare(InWord theInWord, Word theWord) ;

    public boolean compare(Word theWord, InWord theInWord, WordLength wordLength );
}

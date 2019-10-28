package com.example.spell3.service;


import com.example.spell3.entity.MissedWord;
import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;
import com.example.spell3.repository.MissedWordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissedWordServiceImpl implements MissedWordService {

    @Autowired
    private MissedWordsRepository missedWordsRepository;

    public MissedWordServiceImpl() {
        super();
    }

    public List<MissedWord> findAll() {
        return this.missedWordsRepository.findAll();
    }

   // MissedWord missedWord = new MissedWord();

    public void add(final MissedWord missedWord, Word word, WordLength wordLength) {

        switch (wordLength) {
            case FIVE:
                missedWord.setMissedWord(word.getFiveLength());

                break;
            case SIX:
                missedWord.setMissedWord(word.getSixLength());

                break;
            case SEVEN:
                missedWord.setMissedWord(word.getSevenLength());

                break;
            case EIGHT:
                missedWord.setMissedWord(word.getEightLength());

                break;
            case NINE:
                missedWord.setMissedWord(word.getNineLength());

                break;
            case TEN:
                missedWord.setMissedWord(word.getTenLength());
                break;
            case ELEVEN:
                missedWord.setMissedWord(word.getElevenLength());
                break;
            case TWELVE:
                missedWord.setMissedWord(word.getTwelveLength());
                break;
            case THIRTEEN:
                missedWord.setMissedWord(word.getThirteenLength());
                break;
            case FOURTEEN:
                missedWord.setMissedWord(word.getFourteenLength());
                break;
            default:
                System.out.println("in MissedWordServiceImpl enum problem ");

        }


        System.out.println("the word in MissedWordServiceImpl " + missedWord);
        this.missedWordsRepository.add(missedWord);

    }

   public void clearMissedWords(){
         missedWordsRepository.clearMissedWords();
   }
}

package com.example.spell3.service;

import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;
import com.example.spell3.entity.WordRouter;
import org.springframework.stereotype.Service;

@Service
public class CompareWordServiceImpl implements CompareWordService {


    @Override
    public boolean compare(Word theWord, InWord theInWord, WordLength wordLength) {

        System.out.println("in CompareWordServiceImp " + wordLength);
//todo fix switch
        System.out.println("in CompareWordServiceImp theInWord.getInputWord() " + theInWord.getInputWord());
        switch (wordLength) {
            case FIVE:
                System.out.println("in CompareWordServiceImp right word " + theWord.getFiveLength());
                if (theWord.getFiveLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case SIX:
                if (theWord.getSixLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case SEVEN:
                if (theWord.getSevenLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case EIGHT:
                if (theWord.getEightLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case NINE:
                if (theWord.getNineLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case TEN:
                if (theWord.getTenLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case ELEVEN:
                if (theWord.getElevenLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case TWELVE:
                if (theWord.getTwelveLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case THIRTEEN:
                if (theWord.getThirteenLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            case FOURTEEN:
                if (theWord.getFourteenLength().equalsIgnoreCase(theInWord.getInputWord())) {
                    return true;
                }
                break;
            default:
                return false;
        }

        return false;


    }


}

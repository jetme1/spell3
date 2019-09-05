package com.example.spell3.service;

import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordLength;
import com.example.spell3.entity.WordRouter;
import org.springframework.stereotype.Service;

@Service
public class CompareWordServiceImpl implements CompareWordService{
   // WordRouter wordRouter;

 //  private WordRouter wordRouter;
//private String wordSize;



    @Override
    public boolean compare(Word theWord, InWord theInWord, WordLength wordLength ) {
      //  this.wordRouter=wordRouter;
     //   this.wordRouter=wordRouter;
        System.out.println("in CompareWordServiceImp "+   wordLength);
      //  System.out.println("in CompareWordServiceImp getSixLength "+ theWord.getSixLength());
        System.out.println("in CompareWordServiceImp theInWord.getInputWord() "+ theInWord.getInputWord());
 switch(wordLength) {
        case FIVE:
          //  wordSize="getFiveLength()";
            if (theWord.getFiveLength().equalsIgnoreCase(theInWord.getInputWord())) {
                return true;
            }
           // System.out.println("---------5");
             break;
        case SIX:
            if (theWord.getSixLength().equalsIgnoreCase(theInWord.getInputWord())) {
                return true;
            }
         //   System.out.println("---------6");
              break;
     case SEVEN:
         if (theWord.getSevenLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     case EIGHT:
         if (theWord.getEightLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     case NINE:
         if (theWord.getNineLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     case TEN:
         if (theWord.getTenLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;

     case ELEVEN:
         if (theWord.getElevenLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;

     case TWELVE:
         if (theWord.getTwelveLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     case THIRTEEN:
         if (theWord.getThirteenLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     case FOURTEEN:
         if (theWord.getFourteenLength().equalsIgnoreCase(theInWord.getInputWord())) {
             return true;
         }
         //   System.out.println("---------6");
         break;
     default: return false;
    }


        return false;



    }


}

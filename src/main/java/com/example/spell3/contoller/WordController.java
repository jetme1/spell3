package com.example.spell3.contoller;


import com.example.spell3.entity.*;
import com.example.spell3.exceptions.NotFoundException;
import com.example.spell3.service.CompareWordService;
import com.example.spell3.service.CompareWordServiceImpl;
import com.example.spell3.service.WordService;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Mod;
//import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller

public class WordController {

    private WordService wordService;
    private CompareWordService isTheSame;
    private WordLength wordLength;

    private long numberRight = 0L;
    private Long theId = 0L;
    private Long endOfWords = 3L;
    private int tryCount = 0;

    public WordController(WordService wordService, CompareWordService isTheSame) {
        this.wordService = wordService;
        this.isTheSame = isTheSame;
    }

    @ModelAttribute("lengths")//
    public List<WordLength> lengthOfWords() {
        return Arrays.asList(WordLength.ALL);
    }

    @GetMapping("/")
    public String home(Model theModel, @ModelAttribute("wordRouter") WordRouter wordRouter) {
        System.out.println(" controller " + wordRouter);
        //  theModel.addAttribute("WordLength", new WordLength )
        return "/root/root.html";

    }


    @PostMapping("/all")
    public String getWord(Model theModel, @ModelAttribute("wordRouter") WordRouter wordRouter) {

        System.out.println("in getWord enum controller /all " + wordRouter);
        this.wordLength = wordRouter.getWordLength();
        System.out.println("before id " + theId);
        // theModel.addAttribute("wordRouter", wordRouter);

        if (theId == 0L) {
            theId = 1L;
        }
        System.out.println("afterId " + theId);
        System.out.println("after id this " + this.theId);

        Word theWord = wordService.findById(theId, wordRouter);
        //  theModel.addAttribute("theInWord", new InWord());
        theModel.addAttribute("word", theWord);
        System.out.println("in controller " + theWord);
        return "/word/word-all.html";


    }

    @GetMapping("/word/wordCheck/typeWordForm")
    public String inputWord(Model theModel) {
        theModel.addAttribute("theInWord", new InWord());

        return "/word/wordCheck/typeWordForm";
    }


    @PostMapping("/word/wordCheck/typeWordForm")
    public String InWordInput(@Valid @ModelAttribute("theInWord") InWord theInWord, BindingResult bindingResult,
                              Model theModel, @ModelAttribute("wordRouter") WordRouter wordRouter) {
        // System.out.println("in InWordInput "+ wordRouter);
        wordRouter.setWordLength(wordLength);
        System.out.println("in InWordInput wordLength " + wordLength);
        Word theWord = wordService.findById(theId);
        theModel.addAttribute("theInWord", theInWord);
        theModel.addAttribute("word", theWord);
        //CompareWordService isTheSame = new CompareWordServiceImpl();
        System.out.println(isTheSame);
        if (bindingResult.hasErrors()) {
            System.out.println("in error page");
            System.out.println(bindingResult);
            return "/word/wordCheck/typeWordForm";

        } else {

            if (isTheSame.compare(theWord, theInWord, wordLength)) {
                System.out.println("same " + wordLength);
                numberRight++;

                if (theId == endOfWords) {

                    WordTotals theWordTotals = new WordTotals(numberRight, endOfWords);
                    // System.out.println("endOfWords"+ theWordTotals.g);
                    theModel.addAttribute("WordTotals", theWordTotals);
                    theId = 0L;
                    numberRight = 0L;
                    // theModel.addAttribute("numberRight", numberRight );
                    return "/word/word-right-end.html";
                }
                tryCount = 0;
                theId++;

                theWord = wordService.findById(theId);
                theModel.addAttribute("word", theWord);
                System.out.println("post " + theId);
                System.out.println("post this  " + this.theId);


                System.out.println("before word-right wordRouter" + wordRouter);
                return "/word/word-right.html";

            } else {
                if (tryCount < 1) {
                    System.out.println("not the Same" + wordLength);
                    tryCount++;
                    return "word/wordCheck/typeWordFormTryAgain.html";
                } else {
                    System.out.println("in out of tries");
                    System.out.println(" Try count: " + tryCount + " id " + theId + " end of Words " + endOfWords);
                    if (theId == endOfWords) {
                        WordTotals theWordTotals = new WordTotals(numberRight, endOfWords);
                        theModel.addAttribute("WordTotals", theWordTotals);
                        theId = 0L;
                        numberRight = 0L;
                        System.out.println("in last try fail. Try count: " + tryCount + "id" + theId + "end of Words " + endOfWords);
                        return "/word/word-right-end.html";

                    }
                    tryCount = 0;
                    if (theId != endOfWords) {
                        theId++;
                    }
                    theWord = wordService.findById(theId);
                    theModel.addAttribute("word", theWord);
                    System.out.println();
                    System.out.println("before out-of-tries" + wordRouter);
                    return "/word/out-of-tries.html";
                }
            }
        }


    }


    public Long getTheId() {
        return theId;
    }

    public void setTheId(Long theId) {
        this.theId = theId;
    }
}

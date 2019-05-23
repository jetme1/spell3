package com.example.spell3.contoller;


import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
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

@Controller

public class WordController {

    private WordService wordService;
    private CompareWordService isTheSame;


    //private Long theIdCount = 0L;
    private Long theId = 0L;
    private Long endOfWords =3L;
    public WordController(WordService wordService, CompareWordService isTheSame) {
        this.wordService = wordService;
        this.isTheSame = isTheSame;
    }

    @GetMapping("/")
    public String getWord(Model theModel) {
        // theId =theIdCount;
        //  theIdCount= theId++;

        System.out.println("before id " + theId);

        if (theId == 0L) {
            theId = 1L;
        }
        System.out.println("afterid " + theId);
        System.out.println("after id this " + this.theId);

        Word theWord = wordService.findById(theId);
        //  theModel.addAttribute("theInWord", new InWord());
        theModel.addAttribute("word", theWord);
        System.out.println("in controller" + theWord);
        return "/word/word-index.html";

    }

    @GetMapping("/word/wordCheck/typeWordForm")
    public String inputWord(Model theModel) {
        theModel.addAttribute("theInWord", new InWord());

        return "/word/wordCheck/typeWordForm";
    }


    @PostMapping("/word/wordCheck/typeWordForm")
    public String InWordInput(@Valid @ModelAttribute("theInWord")  InWord theInWord, BindingResult bindingResult, Model theModel) {

        Word theWord = wordService.findById(theId);
        theModel.addAttribute("theInWord", theInWord);
        theModel.addAttribute("word", theWord);
        //CompareWordService isTheSame = new CompareWordServiceImpl();
        System.out.println(isTheSame);
        if(bindingResult.hasErrors()){
            System.out.println("in error page");
            System.out.println(bindingResult);
            return "/word/wordCheck/typeWordForm";

        }else {

            if (isTheSame.compare(theWord, theInWord)) {
                System.out.println("same");

                if (theId==endOfWords) {
                    return "/word/word-right-end.html";
                }
                theId++;
                theWord = wordService.findById(theId);
                theModel.addAttribute("word", theWord);
                System.out.println("post " + theId);
                System.out.println("post this  " + this.theId);



                return "/word/word-right.html";

            } else {
                System.out.println("not the Same");
                return "word/wordCheck/typeWordFormError.html";

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

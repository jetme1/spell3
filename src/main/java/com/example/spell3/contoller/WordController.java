package com.example.spell3.contoller;


import com.example.spell3.entity.InWord;
import com.example.spell3.entity.Word;
import com.example.spell3.service.CompareWordService;
import com.example.spell3.service.CompareWordServiceImpl;
import com.example.spell3.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WordController {

    private WordService wordService;
    private CompareWordService isTheSame;

    private Long theId = Long.valueOf(1);

    public WordController(WordService wordService,CompareWordService isTheSame) {
        this.wordService = wordService;
        this.isTheSame =isTheSame;
    }

    @GetMapping("/")
    public String getWord(Model theModel) {

        Word theWord = wordService.findById(theId);
        theModel.addAttribute("theInWord", new InWord());
        theModel.addAttribute("word", theWord);
        System.out.println("in controller" + theWord);
        return "/word/word-index.html";

    }


    @PostMapping("/")
    public String InWordInput(@ModelAttribute InWord theInWord, Model theModel) {

        Word theWord = wordService.findById(theId);
        theModel.addAttribute("theInWord", theInWord);
        theModel.addAttribute("word", theWord);
  //CompareWordService isTheSame = new CompareWordServiceImpl();
  System.out.println(isTheSame);
  if(isTheSame.compare()) {
      System.out.println("same");
  }

        System.out.println(theInWord);
        return "/word/word-index.html";
    }


}

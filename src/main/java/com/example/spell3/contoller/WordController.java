package com.example.spell3.contoller;


import com.example.spell3.entity.Word;
import com.example.spell3.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WordController {

private WordService wordService;


private Long theId= Long.valueOf(1);

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

@GetMapping("/")
    public String getword(Model theModel) {

    Word theWord = wordService.findById(theId);

    theModel.addAttribute("word",theWord);
System.out.println("in controller" +theWord);
    return "/word/word-index.html";


}



}

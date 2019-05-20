package com.example.spell3.contoller;

import com.example.spell3.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerExceptionHandler {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleNotFound(Exception exception){



        ModelAndView modelAndView;
        modelAndView = new ModelAndView();

        modelAndView.setViewName("/word/wordCheck/404error");
        modelAndView.addObject("exception", exception);

        return modelAndView;
    }



}

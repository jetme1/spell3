package com.example.spell3.service;

import org.springframework.stereotype.Service;

@Service
public class CompareWordServiceImpl implements CompareWordService{


    @Override
    public boolean compare() {
        return true;
    }

    @Override
    public String toString() {
        return "CompareWordServiceImpl{}";
    }
}

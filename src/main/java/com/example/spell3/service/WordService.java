package com.example.spell3.service;

import com.example.spell3.entity.Word;
import com.example.spell3.entity.WordRouter;

public interface WordService {

    public Word findById(Long theId, WordRouter wordRouter);
    public Word findById(Long theId);



}

package com.learn.springairag.services;

import com.learn.springairag.model.Answer;
import com.learn.springairag.model.Question;

public interface OpenAIService {

    Answer getAnswer(Question question);

}

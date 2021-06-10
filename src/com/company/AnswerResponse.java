package com.company;

public interface AnswerResponse {
    void onCorrect();

    void onIncorrect(String answer);
}


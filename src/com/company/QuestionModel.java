package com.company;

import java.util.ArrayList;

// This class has getter and setters for questions
// and it holds all the information about the question
public class QuestionModel {
    private String question;
    private ArrayList<String> options;
    private int answer;




    public QuestionModel(String question, ArrayList<String> options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString(){
        return question + options.toString() + answer;
    }

}

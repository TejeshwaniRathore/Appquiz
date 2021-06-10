package com.company;

import java.util.ArrayList;

public abstract class Topic {
    AnswerResponse answerResponse;

    public Topic(AnswerResponse answerResponse) {
        this.answerResponse = answerResponse;
    }

    abstract String getTopic();

    abstract ArrayList<QuestionModel> getQuestions();

    void checkAnswer(int question, int option) {
        // TODO: As checking answer would be same for any topic
        // we give a common implementation in abstarct class
    }

}

class Maths extends Topic {

    public Maths(AnswerResponse answerResponse) {
        super(answerResponse);
    }

    @Override
    String getTopic() {
        // TODO: This will return the topic name
        return "Maths";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> list = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();

            options.add("1)PL");
            options.add("2)SL");
            options.add("3)Both");
            options.add("4)None");



      for (int i = 0; i < 4; i++) {
            list.add(new QuestionModel("1)What is java", options, 1));
            list.add(new QuestionModel("2) Which of the following is not a Java features?", options, 3));
            list.add(new QuestionModel("3) _____ is used to find and fix bugs in the Java programs.", options, 1));
            list.add(new QuestionModel("4) Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?", options, 1));

            return list;
        }

        return null;
    }


}
class C extends Topic {

    public C(AnswerResponse answerResponse) {
        super(answerResponse);
    }

    @Override
    String getTopic() {
        // TODO: This will return the topic name
        return "C";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> list = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();

        options.add("1)The program must have at least one function");
        options.add("2)The program does not require any function");
        options.add("3)Input data");
        options.add("4)Output data");


        for (int i = 0; i < 4; i++) {
        list.add(new QuestionModel("1)What is required in each C program?", options, 1));
        list.add(new QuestionModel("2) What is a lint??", options, 3));
        list.add(new QuestionModel("3) Why is a macro used in place of a function?", options, 4));
        list.add(new QuestionModel("4)In the C language, the constant is defined _______.", options, 3));

        return list;
        }

        return null;
    }


}
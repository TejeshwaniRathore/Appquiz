package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static AnswerResponse answerResponse = new AnswerResponse() {
        @Override
        public void onCorrect() {
            // TODO: Correct answer was selected
            System.out.println("correct");
        }

        @Override
        public void onIncorrect(String answer) {
            // TODO: Incorrect answer was selected
            System.out.println("incorrect");
        }
    };

    public static void main(String[] args) throws Exception {
        C c = new C(answerResponse);
        Maths maths = new Maths(answerResponse);
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(maths);
        topics.add(c);
        boolean chose = false;
        Util util = new Util(answerResponse);






            // Print topics
            for (Topic topic : topics) {
                print(topic.getTopic());
            }

            Scanner sc = new Scanner(System.in);
            int topic = sc.nextInt();

            Topic selTopic = topics.get(topic);

            // print question and options
            ArrayList<QuestionModel> questionModels = selTopic.getQuestions();
            int count = 0;
            for (int i = 0; i < questionModels.size(); i++) {
                QuestionModel question = questionModels.get(i);

                print("");
                print(question.getQuestion());
                print("");


                for (String options : question.getOptions()) {
                    System.out.println(options);
                }
                int selected = sc.nextInt();
                util.checkAnswer(question, selected);

                if (selected == question.getAnswer()) {
                    count++;
                }
            }
            System.out.println("Marks:" + count);
            sc.close();

        }


        static void print (String value){
            System.out.println(value);
        }

    }



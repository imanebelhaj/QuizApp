package com.example.quizappbelhajg51;

import java.util.List;
import java.util.ArrayList;

public class Question {
    String question;
    String image;
    String choice1;
    String choice2;
    String correct;




    public Question(String question, String choice1, String choice2, String correct, String image) {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.correct = correct;
        this.image = image;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }


    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getCorrect() {

        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}

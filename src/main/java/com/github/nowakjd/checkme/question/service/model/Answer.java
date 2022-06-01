package com.github.nowakjd.checkme.question.service.model;

import java.util.List;

public class Answer {
    private Long id;
    private Question question;
    private List<String> answer;

    Score getScore(){
        return question.getScore(answer);
    }
}

package com.github.nowakjd.checkme.question.service.model;

import com.github.nowakjd.checkme.question.service.model.calculator.QuestionCalculator;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Question {
    @Getter
    private QuestionTemplate template;
    @Getter
    private Long id;
    @Getter
    private String stem;
    private Set<String> options;
    private List<String> correct;
    private QuestionCalculator calculator;
    private Score score;

    public Set<String> options() {
        return Collections.unmodifiableSet(options);
    }

    public Score getScore(List<String> answer) {
        return calculator.getMark(correct, answer, score);
    }


}

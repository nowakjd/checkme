package com.github.nowakjd.checkme.question.service.model.calculator;

import com.github.nowakjd.checkme.question.service.model.Score;

import java.util.List;

public interface QuestionCalculator {
 Score getMark(List<String> correct, List<String> responded ,Score score);
}

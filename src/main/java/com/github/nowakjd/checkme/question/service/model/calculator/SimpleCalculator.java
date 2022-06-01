package com.github.nowakjd.checkme.question.service.model.calculator;

import com.github.nowakjd.checkme.question.service.model.Score;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SimpleCalculator implements QuestionCalculator {
    @Override
    public Score getMark(List<String> correct, List<String> responded, Score score) {
      return  CollectionUtils.isEqualCollection(correct,responded) ? score.getMaxScore() : score.getZeroScore();
    }
}

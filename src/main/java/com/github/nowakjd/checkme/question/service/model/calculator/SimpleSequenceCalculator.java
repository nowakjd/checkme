package com.github.nowakjd.checkme.question.service.model.calculator;

import com.github.nowakjd.checkme.question.service.model.Score;
import org.apache.commons.collections4.ListUtils;

import java.util.List;

public class SimpleSequenceCalculator implements QuestionCalculator {
    @Override
    public Score getMark(List<String> correct, List<String> responded, Score score) {
        return ListUtils.isEqualList(correct, responded) ? score.getMaxScore() : score.getZeroScore() ;
    }
}

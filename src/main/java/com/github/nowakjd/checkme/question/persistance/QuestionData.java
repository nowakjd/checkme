package com.github.nowakjd.checkme.question.persistance;

import java.util.List;
import java.util.Set;

public record QuestionData(Long id, String stem, List<String> options, List<String> correct, Set<QuestionTag> tags,
                           CorrectColectionType type, QuestionStatus status) {
}

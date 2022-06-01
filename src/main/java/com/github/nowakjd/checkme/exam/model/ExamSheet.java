package com.github.nowakjd.checkme.exam.model;

import com.github.nowakjd.checkme.question.service.model.Question;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

public class ExamSheet {
    List<Question> questions;
    LocalDateTime deadLine;
    Period duration;
}

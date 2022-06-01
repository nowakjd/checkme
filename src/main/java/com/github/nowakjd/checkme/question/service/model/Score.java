package com.github.nowakjd.checkme.question.service.model;

public record Score(int mark, int max) {

    public Score getMark(int mark) {
        if (max < mark) {
            throw new RuntimeException();
        } else return new Score(mark, this.max);
    }

    public Score getZeroScore() {
        return new Score(0, max);
    }

    public Score getMaxScore() {
        return new Score(max, max);
    }
}

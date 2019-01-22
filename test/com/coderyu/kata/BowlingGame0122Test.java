package com.coderyu.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGame0122Test {

    private BowlingGame0122 game;

    @BeforeEach
    void prepare() {
        game = new BowlingGame0122();
    }

    @Test
    void playGame() {
        game.roll(1);
        assertEquals(1, game.score());
    }

    @Test
    void rollAllZero() {
        rollMany(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    void rollAllOne() {
        rollMany(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    void rollOneStrike() {
        rollSpare();
        rollMany(1, 18);
        assertEquals(10 + 1 + 2 * 9, game.score());
    }

    @Test
    void rollOneSpare() {
        rollStrike();
        rollMany(1, 18);
        assertEquals(10 + 1 + 1 + 2 * 9, game.score());
    }

    @Test
    void allSpare() {
        rollMany(5, 21);
        assertEquals(15 * 10, game.score());
    }

    @Test
    void allStrike() {
        rollMany(10, 12);
        assertEquals(30*10, game.score());
    }

    private void rollMany(int pins, int frames) {
        IntStream range = IntStream.range(0, frames);
        range.forEach(i -> game.roll(pins));
    }

    private void rollSpare(){
        game.roll(4);
        game.roll(6);
    }

    private void rollStrike(){
        game.roll(10);
    }

}
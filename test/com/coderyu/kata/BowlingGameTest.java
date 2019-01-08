package com.coderyu.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    BowlingGame game;

    @BeforeEach
    void setUp() {
        game = new BowlingGame();
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
    void rollOneSpare() {
        game.roll(4);
        game.roll(6);
        game.roll(5);
        rollMany(1, 17);

        assertEquals(15 + 5 + 17, game.score());
    }

    @Test
    void rollAllSpare() {
        rollMany(5, 21);
        assertEquals(15 * 9 + 10 + 5, game.score());
    }

    @Test
    void rollOneStrike() {
        game.roll(10);
        rollMany(1, 18);
        assertEquals(10 + 1 + 1 + 18, game.score());
    }

    @Test
    void rollAllStrike() {
        rollMany(10, 12);
        assertEquals(30 * 9 + 10 + 10 + 10, game.score());
    }

    private void rollMany(int pin, int count) {
        IntStream range = IntStream.range(0, count);
        range.forEach(i -> game.roll(pin));
    }
}
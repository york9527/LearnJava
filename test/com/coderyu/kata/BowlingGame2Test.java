package com.coderyu.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGame2Test {

    BowlingGame2 game;

    @BeforeEach
    void setUp() {
        game=new BowlingGame2();
    }

    private void rollMany(int pin,int count){
        IntStream range=IntStream.range(0,count);
        range.forEach(i->game.roll(pin));
    }


    @Test
    void roll_all_zero(){
        rollMany(0,20);

        assertEquals(0,game.score());
    }

    @Test
    void roll_all_one() {
        rollMany(1,20);

        assertEquals(20,game.score());
    }

    @Test
    void roll_one_spare(){
        game.roll(4);
        game.roll(6);
        rollMany(1,18);

        assertEquals(11+2*9,game.score());
    }

    @Test
    void roll_two_spare() {
        game.roll(4);
        game.roll(6);
        game.roll(5);
        game.roll(5);
        rollMany(1,16);

        assertEquals(15+11+2*8,game.score());
    }

    @Test
    void roll_one_strike() {
        game.roll(10);
        rollMany(1,18);

        assertEquals(10+1+1+2*9,game.score());
    }

    @Test
    void roll_all_strike() {
        rollMany(10,12);
        assertEquals(30*10,game.score());
    }
    @Test
    public void testTenPinsNotSpare() {
        game.roll(0);
        game.roll(7);
        game.roll(3);
        game.roll(2);
        rollMany(0, 16);
        assertEquals(12, game.score());
    }
}
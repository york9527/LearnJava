package com.coderyu.kata;

import java.util.ArrayList;

public class BowlingGame2 {

    private ArrayList<Integer> rollRecords = new ArrayList<>();

    public void roll(int pin) {
        rollRecords.add(pin);
    }

    public int score() {
        int totalScore = 0;
        int index = 0;

        for (int i = 0; i < 10; i++) {
            if (isaSpare(index)) {
                totalScore += 10 + bonusOfSpare(index);
                index += 2;
            } else if (isaStrike(index)) {
                totalScore += 10 + bonusOfStrike(index);
                index += 1;
            } else {
                totalScore += sumBallsOfOneFrame(index);
                index += 2;
            }
        }
        return totalScore;
    }

    private int sumBallsOfOneFrame(int index) {
        return rollRecords.get(index) + rollRecords.get(index + 1);
    }

    private int bonusOfStrike(int index) {
        return rollRecords.get(index + 1) + rollRecords.get(index + 2);
    }

    private Integer bonusOfSpare(int index) {
        return rollRecords.get(index + 2);
    }

    private boolean isaStrike(int index) {
        return rollRecords.get(index) == 10;
    }

    private boolean isaSpare(int index) {
        return rollRecords.get(index) + rollRecords.get(index + 1) == 10;
    }
}

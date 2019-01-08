package com.coderyu.kata;

import java.util.ArrayList;

public class BowlingGame {

    private ArrayList<Integer> roleList = new ArrayList<>();

    public void roll(int pins) {
        roleList.add(pins);
    }

    public int score() {
        int totalScore = 0;
        int frameIndex = 0;
        for (int i = 0; i < 10; i++) {

            if (isStrike(frameIndex)) {
                totalScore += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                totalScore += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                totalScore += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return totalScore;
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return roleList.get(frameIndex) + roleList.get(frameIndex + 1);
    }

    private int spareBonus(int frameIndex) {
        return roleList.get(frameIndex + 2);
    }

    private int strikeBonus(int frameIndex) {
        return roleList.get(frameIndex + 1) + roleList.get(frameIndex + 2);
    }

    private boolean isStrike(int frameIndex) {
        return roleList.get(frameIndex) == 10;
    }

    private boolean isSpare(int frameIndex) {
        return roleList.get(frameIndex) + roleList.get(frameIndex + 1) == 10;
    }

}

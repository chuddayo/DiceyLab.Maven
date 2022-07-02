package com.zipcodewilmington.dice;

import java.util.Random;

public class Dice {
    private final int numSides = 6;
    private final int numDice;

    public static Random randNum = new Random();

    public Dice(int numDice) {
        this.numDice = numDice;
    }
    public int getNumDice() {
        return numDice;
    }

    public int tossAndSum() {
        int diceSum = 0;
        int counter = 0;
        while (counter < numDice) {
            diceSum += randNum.nextInt(numSides) + 1;
            counter++;
        }
        return diceSum;
    }
}

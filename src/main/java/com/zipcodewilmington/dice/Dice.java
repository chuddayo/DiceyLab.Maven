package com.zipcodewilmington.dice;

import java.util.Random;

public class Dice {
    private final int numSides;
    private final int numDice;

    public static Random randNum = new Random();

    public Dice(int numDice) {
        this.numDice = numDice;
        this.numSides = 6;
    }
    public Dice(int numDice, int numSides) {
        this.numDice = numDice;
        this.numSides = numSides;
    }
    public int getNumDice() {return numDice;}
    public int getNumSides() {return numSides;}

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

package com.zipcodewilmington.dice;

import org.junit.jupiter.api.*;

public class TestDice {
    @Test
    public void constructorTest() {
        // Given
        Dice dice = new Dice(2); // two six-sided dice

        // When
        int actual = dice.getNumDice();

        // Then
        Assertions.assertEquals(2, actual);
    }
    @Test
    public void constructorTest2() {
        // Given
        Dice dice = new Dice(2); // two six-sided dice

        // When
        int actual = dice.getNumSides();

        // Then
        Assertions.assertEquals(6, actual);
    }
    @Test
    public void constructorTest3() {
        // Given
        Dice dice = new Dice(2, 5);

        // When
        int actual = dice.getNumSides();

        // Then
        Assertions.assertEquals(5, actual);
    }
    @Test
    public void rollTest() {
        // Given
        Dice dice = new Dice(2); // two six-sided dice

        // When
        int diceRoll = dice.tossAndSum();
        boolean expected = diceRoll >= 2 && diceRoll <= 12;

        // Then
        Assertions.assertTrue(expected);
    }

    @Test
    public void rollTest2() {
        // Given
        Dice dice = new Dice(2); // two six-sided dice

        // When
        int diceRoll = dice.tossAndSum();
        diceRoll += dice.tossAndSum();
        boolean expected = diceRoll >= 4 && diceRoll <= 24;

        // Then
        Assertions.assertTrue(expected);
    }


}

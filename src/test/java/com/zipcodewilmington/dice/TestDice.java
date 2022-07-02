package com.zipcodewilmington.dice;

import org.junit.jupiter.api.*;

public class TestDice {

    @Test
    public void rollTest() {
        // Given
        Dice dice = new Dice(2); // two six-sided dice

        // When
        int diceRoll = dice.roll();
        System.out.println(diceRoll);
        boolean expected = diceRoll >= 2 && diceRoll <= 12;

        // Then
        Assertions.assertTrue(expected);
    }


}

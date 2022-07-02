package com.zipcodewilmington.dice;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSimulation {
    @Test
    public void clearResultsTest() {
        Simulation simTest = new Simulation(2);
        simTest.runSimulation();
        StringBuilder initResults = simTest.getResults();

        simTest.clearResults();
        StringBuilder actualResults = simTest.getResults();

        Assertions.assertNotEquals(initResults, actualResults);
    }

    @Test
    public void parseResultsTest() {
        Simulation simTest = new Simulation(2);
        Bins binTest = new Bins(12);
        binTest.incrementBin(2);
        binTest.incrementBin(2);
        binTest.incrementBin(3);
        binTest.incrementBin(3);
        binTest.incrementBin(3);
        binTest.incrementBin(3);
        StringBuilder expected = new StringBuilder(" 2 :        2: 1.00 ****************************************************************************************************\n" +
                " 3 :        4: 2.00 ********************************************************************************************************************************************************************************************************\n" +
                " 4 :        0: 0.00 \n" +
                " 5 :        0: 0.00 \n" +
                " 6 :        0: 0.00 \n" +
                " 7 :        0: 0.00 \n" +
                " 8 :        0: 0.00 \n" +
                " 9 :        0: 0.00 \n" +
                "10 :        0: 0.00 \n" +
                "11 :        0: 0.00 \n" +
                "12 :        0: 0.00 \n");

        simTest.parseResults(binTest);
        StringBuilder actual = simTest.getResults();

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

}

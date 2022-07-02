package com.zipcodewilmington.dice;

import org.junit.jupiter.api.*;

public class TestBins {
    @Test
    public void incrementBinTest() {
        // Given a bin is created
        Bins bins = new Bins(12);

        // When a bin is incremented and retrieved with getBin
        bins.incrementBin(7);
        bins.incrementBin(7);
        bins.incrementBin(7);
        int actual = bins.getBin(7);

        // Then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void sizeTest() {
        // Given a bin is created
        Bins bins = new Bins(12);

        // When a bin is incremented and retrieved with getBin
        int actual = bins.size();

        // Then
        Assertions.assertEquals(13, actual);
    }

    @Test
    public void sizeTest2() {
        // Given a bin is created
        Bins bins = new Bins(25);

        // When a bin is incremented and retrieved with getBin
        int actual = bins.size();

        // Then
        Assertions.assertNotEquals(28, actual);
    }
}

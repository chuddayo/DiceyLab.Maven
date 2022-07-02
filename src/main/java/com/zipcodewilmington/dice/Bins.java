package com.zipcodewilmington.dice;

import java.util.ArrayList;
import java.util.Collections;

public class Bins {
    private ArrayList<Integer> results;
    public Bins (int high) {
        results = new ArrayList<Integer>(Collections.nCopies(high, 0));
    }
    public Bins (int low, int high) {
        results = new ArrayList<Integer>(Collections.nCopies(high, 0));
    }

    public Integer getBin(int binNum) {
        return this.results.get(binNum);
    }

    public void incrementBin(int binNum) {
        results.set(binNum, results.get(binNum) + 1);
    }
}

package com.zipcodewilmington.dice;

import java.util.Formatter;
public class Simulation {

    private int numThrows;
    private int numDice;
    private StringBuilder results;

    public Simulation (int numThrows) {
        this.numThrows = numThrows;
        this.numDice = 2;
        this.results = new StringBuilder();
    }
    public Simulation (int numThrows, int numDice) {
        this.numThrows = numThrows;
        this.numDice = numDice;
        this.results = new StringBuilder();
    }

    public int getNumDice() {
        return numDice;
    }

    public void setNumDice(int numDice) {
        this.numDice = numDice;
    }

    public int getNumThrows() {
        return numThrows;
    }

    public void setNumThrows(int numThrows) {
        this.numThrows = numThrows;
    }

    public StringBuilder getResults() {return results;}

    public void runSimulation() {
        Dice dice = new Dice(numDice);
        Bins bins = new Bins(6 * numDice);

        for (int i = 1; i <= numThrows; i++) {
            bins.incrementBin(dice.tossAndSum());
        }

        parseResults(bins);
    }
    public void clearResults() {
        results = new StringBuilder();
    }
    public void parseResults(Bins bins) {
        clearResults();
        // specific for 2 dice with 6 sides, could pass it the dice?
        for (int i = 2; i <= 12; i++) {
            results.append(String.format("%2d :%9d: %4.2f %s\n", i, bins.getBin(i), (1.0 * bins.getBin(i) / numThrows),
                    getStarsAsPercentage(1.0 * bins.getBin(i) / numThrows)));
        }
    }

    public void printResults() { System.out.println(results); }

    private String getStarsAsPercentage(double percentage) {
        StringBuilder stars = new StringBuilder();
        int numStars = (int)(100 * percentage);

        for (int i = 1; i <= numStars; i++) {
            stars.append("*");
        }

        return String.valueOf(stars);
    }
}

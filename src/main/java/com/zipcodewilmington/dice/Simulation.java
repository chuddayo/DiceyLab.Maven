package com.zipcodewilmington.dice;

public class Simulation {

    private int numThrows;
    private int numDice;
    private String results;

    public Simulation (int numThrows) {
        this.numThrows = numThrows;
        this.numDice = 2;
        this.results = "";
    }
    public Simulation (int numThrows, int numDice) {
        this.numThrows = numThrows;
        this.numDice = numDice;
        this.results = "";
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

    public void runSimulation() {
        // create Dice and Bins (based on numDice)
        // run numThrows rolls
        // call parseResults sending it the bins
    }

    private void parseResults(Bins bins) {

    }

    public String printResults() {
        return results;
    }
}

package com.zipcodewilmington.dice;

public class Main {
    public static void main(String[] args) {
        Simulation oneMill = new Simulation(1000000);
        oneMill.runSimulation();
        oneMill.printResults();
    }
}

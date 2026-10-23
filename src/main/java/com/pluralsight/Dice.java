package com.pluralsight;


public class Dice {

    // generates a random number between 1 and 6
    public int roll (int minValue, int maxValue) {
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }

}

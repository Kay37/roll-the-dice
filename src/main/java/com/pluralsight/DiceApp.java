package com.pluralsight;

public class DiceApp {

    public static void main(String[] args) {

        //TODO: An app that will roll a pair of dice 100 times.
        // * The value of the two dice will display each time they are rolled.
        // * Include a count for how many times the sum of the roll is 2, 4, 6, or 7 and display that count.
        // * Variables for this exercise:
        Dice dice = new Dice();
        int twoCount = 0;
        int fourCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int looper = 0;

        // * Create a loop that executes 100 times. Inside the loop roll 2 dice
        while (looper <= 99) {
            int roll1 = dice.roll(1, 6);
            int roll2 = dice.roll(1, 6);
            int sum = roll1 + roll2;
            if (sum == 2) {
                twoCount++;
            }
            if (sum == 4) {
                fourCount++;
            }
            if (sum == 6) {
                sixCount++;
            }
            if (sum == 7) {
                sevenCount++;
            }
            looper++;
            System.out.printf("""
        The dice has been rolled %d number of times. Roll %d: %d - %d Sum: %d%n""", looper, looper, roll1, roll2, sum);

        } // ! while loop cBracket

        System.out.printf("""
                The sum of the roll has reached 2, 4, 6, or 7 this many times each across %d rolls:
                Two: %d
                Four: %d
                Six: %d
                Seven: %d
                """, looper, twoCount, fourCount, sixCount, sevenCount);

    } // ! main method cBracket

} // ! main class cBracket
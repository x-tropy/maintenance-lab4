package com.ae2dms.lab4.state;

// The vending machine written with an if/else chain in every method.
// It works, but every method must know about every state.
public class IfElseCandyMachine {
    private static final int NO_COIN = 0;
    private static final int CONTAINS_COIN = 1;
    private static final int NO_CANDY = 2;

    private int state;
    private int count;

    public IfElseCandyMachine(int numberOfCandies) {
        count = numberOfCandies;
        state = (count > 0) ? NO_COIN : NO_CANDY;
    }

    public void insertCoin() {
        System.out.println("> insert coin");
        if (state == NO_COIN) {
            System.out.println("Coin accepted.");
            state = CONTAINS_COIN;
        } else if (state == CONTAINS_COIN) {
            System.out.println("You have already inserted a coin.");
        } else if (state == NO_CANDY) {
            System.out.println("Sorry, the machine is empty.");
        }
    }

    public void pressButton() {
        System.out.println("> press button");
        if (state == NO_COIN) {
            System.out.println("Please insert a coin first.");
        } else if (state == CONTAINS_COIN) {
            count = count - 1;
            System.out.println("Here is your candy!");
            if (count > 0) {
                state = NO_COIN;
            } else {
                System.out.println("The machine is now empty.");
                state = NO_CANDY;
            }
        } else if (state == NO_CANDY) {
            System.out.println("Sorry, the machine is empty.");
        }
    }

    private String stateName() {
        if (state == NO_COIN) return "NoCoinState";
        else if (state == CONTAINS_COIN) return "ContainsCoinState";
        else return "NoCandyState";
    }

    @Override
    public String toString() {
        return "[state: " + stateName() + ", candies: " + count + "]";
    }
}

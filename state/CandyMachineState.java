package com.ae2dms.lab4.state;

// Every state must say what happens for each action the customer can do.
public interface CandyMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}

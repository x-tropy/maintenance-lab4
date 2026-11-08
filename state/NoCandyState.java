package com.ae2dms.lab4.state;

// The machine is empty: every action gets the same answer.
public class NoCandyState implements CandyMachineState {
    private CandyVendingMachine machine;

    public NoCandyState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, the machine is empty.");
    }

    @Override
    public void pressButton() {
        System.out.println("Sorry, the machine is empty.");
    }

    @Override
    public void dispense() {
        // nothing to dispense
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}

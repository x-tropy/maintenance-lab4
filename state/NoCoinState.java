package com.ae2dms.lab4.state;

// The machine is waiting for a coin.
// TODO (3.3): complete the three methods using the table on the lab sheet.
public class NoCoinState implements CandyMachineState {
    private CandyVendingMachine machine;

    public NoCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        // TODO
    }

    @Override
    public void pressButton() {
        // TODO
    }

    @Override
    public void dispense() {
        // TODO
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}

package state;

// A coin has been inserted; the machine is waiting for the button.
// TODO (3.3): complete the three methods using the table on the lab sheet.
public class ContainsCoinState implements CandyMachineState {
    private CandyVendingMachine machine;

    public ContainsCoinState(CandyVendingMachine machine) {
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
        return "ContainsCoinState";
    }
}

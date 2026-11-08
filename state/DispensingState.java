package state;

// The machine is giving out a candy.
public class DispensingState implements CandyMachineState {
    private CandyVendingMachine machine;

    public DispensingState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, your candy is coming.");
    }

    @Override
    public void pressButton() {
        System.out.println("Please wait, your candy is coming.");
    }

    @Override
    public void dispense() {
        machine.setCount(machine.getCount() - 1);
        System.out.println("Here is your candy!");
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("The machine is now empty.");
            machine.setState(machine.getNoCandyState());
        }
    }

    @Override
    public String toString() {
        return "DispensingState";
    }
}

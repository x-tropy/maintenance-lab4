package state;

// Every state must say what happens for each action the customer can do.
public interface CandyMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}

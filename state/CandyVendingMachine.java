package state;

// The Context: it holds one object for each state, and the current state.
// Each action is simply passed on to the current state object.
public class CandyVendingMachine {
    private CandyMachineState noCoinState;
    private CandyMachineState containsCoinState;
    private CandyMachineState dispensingState;
    private CandyMachineState noCandyState;

    private CandyMachineState state;
    private int count;

    public CandyVendingMachine(int numberOfCandies) {
        count = numberOfCandies;
        noCoinState = new NoCoinState(this);
        containsCoinState = new ContainsCoinState(this);
        dispensingState = new DispensingState(this);
        noCandyState = new NoCandyState(this);
        state = (count > 0) ? noCoinState : noCandyState;
    }

    public void insertCoin() {
        System.out.println("> insert coin");
        state.insertCoin();
    }

    public void pressButton() {
        System.out.println("> press button");
        state.pressButton();
        state.dispense();
    }

    // Used by the state objects to move the machine to another state
    public void setState(CandyMachineState state) { this.state = state; }

    public CandyMachineState getNoCoinState()       { return noCoinState; }
    public CandyMachineState getContainsCoinState() { return containsCoinState; }
    public CandyMachineState getDispensingState()   { return dispensingState; }
    public CandyMachineState getNoCandyState()      { return noCandyState; }

    public int getCount()           { return count; }
    public void setCount(int count) { this.count = count; }

    @Override
    public String toString() {
        return "[state: " + state + ", candies: " + count + "]";
    }
}

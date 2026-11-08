package state;

public class StateTester {
    public static void main(String[] args) {
        System.out.println("===== If/else version =====");
        IfElseCandyMachine m1 = new IfElseCandyMachine(2);
        System.out.println(m1);
        m1.insertCoin();
        m1.pressButton();
        System.out.println(m1);
        m1.pressButton();
        m1.insertCoin();
        m1.insertCoin();
        m1.pressButton();
        System.out.println(m1);
        m1.insertCoin();

        System.out.println();
        System.out.println("===== State pattern version =====");
        CandyVendingMachine m2 = new CandyVendingMachine(2);
        System.out.println(m2);
        m2.insertCoin();
        m2.pressButton();
        System.out.println(m2);
        m2.pressButton();
        m2.insertCoin();
        m2.insertCoin();
        m2.pressButton();
        System.out.println(m2);
        m2.insertCoin();
    }
}

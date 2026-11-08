package singleton;

public class SingletonTester {
    public static void main(String[] args) {
        // The OPTION screen lets the player choose a colour
        GameSettings optionScreen = new GameSettings();
        optionScreen.setBackgroundColour("Blue");

        // Later, the GAME screen reads the settings
        GameSettings gameScreen = new GameSettings();
        System.out.println("Game screen colour: " + gameScreen.getBackgroundColour());
        System.out.println("Same object? " + (optionScreen == gameScreen));
    }
}

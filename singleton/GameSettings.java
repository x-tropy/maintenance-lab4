package com.ae2dms.lab4.singleton;

// The settings chosen on the game's OPTION screen.
// Problem: anyone can call new GameSettings(), so each screen can end up with its own copy.
public class GameSettings {
    private String backgroundColour;

    public GameSettings() {
        backgroundColour = "Black";
    }

    public String getBackgroundColour() {
        return backgroundColour;
    }

    public void setBackgroundColour(String colour) {
        backgroundColour = colour;
    }
}

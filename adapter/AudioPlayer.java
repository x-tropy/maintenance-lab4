package com.ae2dms.lab4.adapter;

// Our audio player can only play mp3 files.
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid media: " + audioType + " format not supported");
        }
    }
}

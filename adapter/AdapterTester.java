package com.ae2dms.lab4.adapter;

public class AdapterTester {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "theme-song.mp3");
        player.play("mp4", "match-highlights.mp4");
        player.play("vlc", "pong-tutorial.vlc");
        player.play("avi", "old-video.avi");
    }
}

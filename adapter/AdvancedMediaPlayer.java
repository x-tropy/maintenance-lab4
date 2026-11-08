package adapter;

// An interface from another library. Its methods do not match MediaPlayer.
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

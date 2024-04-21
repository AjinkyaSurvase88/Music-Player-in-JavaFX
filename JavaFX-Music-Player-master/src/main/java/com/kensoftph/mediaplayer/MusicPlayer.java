package com.kensoftph.mediaplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MusicPlayer {

    @FXML
    private Label currentSongLabel;

    @FXML
    private ImageView animation;

    private MediaPlayer mediaPlayer;

    @FXML
    void play(MouseEvent event) {
        // Load the music file directly
        String musicFile = "don.mp3"; // Assuming don.mp3 is in the project directory
        Media media = new Media(new File(musicFile).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        // Set the current song label
        currentSongLabel.setText("Now Playing: " + musicFile);

        // Play the music
        mediaPlayer.play();

        // Load and display the GIF animation
        Image gifImage = new Image(getClass().getResourceAsStream("/com/kensoftph/mediaplayer/animated0.gif"));
        animation.setImage(gifImage);
    }

    @FXML
    void pause(MouseEvent event) {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @FXML
    void stop(MouseEvent event) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @FXML
    void decreaseVolume(MouseEvent event) {
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(mediaPlayer.getVolume() - 0.1);
        }
    }

    @FXML
    void increaseVolume(MouseEvent event) {
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(mediaPlayer.getVolume() + 0.1);
        }
    }
}

package com.example.designpatterns.FactoryDesignPattern.Assignment_AudioPlayer_Solved;

public class Client {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = AudioPlayerFactory.getAudioPlayer(MediaFormat.FLAC,10,10);
        audioPlayer.play();
    }
}

package com.example.designpatterns.FactoryDesignPattern.Assignment_AudioPlayer_Solved;

public abstract class AudioPlayer {

    public int volume;
    public int playBackRate;
    public abstract MediaFormat supportsType();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}


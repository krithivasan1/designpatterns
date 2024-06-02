
package com.example.designpatterns.FactoryDesignPattern.Assignment_AudioPlayer_Solved;

public class AudioPlayerFactory {

    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate){
        if(mediaFormat==MediaFormat.WAV){
            return new WAVPlayer(volume,playBackRate);
        }
        else if(mediaFormat== MediaFormat.MP3){
            return new MP3Player(volume,playBackRate);
        }
        else if(mediaFormat == MediaFormat.FLAC){
            return new FLACPlayer(volume,playBackRate);
        }
        else
            return null;
    }
}
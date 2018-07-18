package com.bobo.adapter;

/**
 * Created by evildoerDb on 2018/7/18 13:57
 *
 * 适配器模式测试
 */
public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}

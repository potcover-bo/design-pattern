package com.bobo.adapter;

/**
 * Created by evildoerDb on 2018/7/18 14:10
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 : " + fileName);
    }
}

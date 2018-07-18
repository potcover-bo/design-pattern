package com.bobo.adapter;

/**
 * Created by evildoerDb on 2018/7/18 14:09
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playVlc :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

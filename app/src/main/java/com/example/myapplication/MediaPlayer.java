package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MediaPlayer extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
    }

    public void play (View view){
        if(mediaPlayer == null){
            MediaPlayer.create(getApplicationContext(),R.raw.song);
            mediaPlayer.start();

        }else{
            mediaPlayer.start();
        }
    }

    //method
    private void start() {
    }

    //method
    private static MediaPlayer create(Context applicationContext, int song) {
        return null;
    }

    public void pause(View view){
        if(mediaPlayer!= null){
            mediaPlayer.pause();
        }
    }

    //method
    private void pause() {
    }

    public void stop(View view){
        mediaPlayer.release();
        mediaPlayer = null;
    }

    //method
    private void release() {
    }
}
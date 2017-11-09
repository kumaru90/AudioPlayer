package com.example.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this,R.raw.r2d2);
    }

    public void playSound(View view){
        mySound.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mySound.release();
    }


}

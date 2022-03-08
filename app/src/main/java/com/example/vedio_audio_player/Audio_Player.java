package com.example.vedio_audio_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Audio_Player extends AppCompatActivity {
    MediaPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);
        audioPlayer = MediaPlayer.create(this, R.raw.relax);
    }

    public void Play_Music(View view) {
        audioPlayer.start();
    }

    public void Stop_Music(View view) {
        audioPlayer.stop();
    }
}
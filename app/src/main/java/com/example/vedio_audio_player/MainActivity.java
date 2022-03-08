package com.example.vedio_audio_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        imageView.animate().alpha(1f).setDuration(5000);


    }

    public void Audio_Player(View view) {
        Intent intent1 = new Intent(MainActivity.this, Audio_Player.class);
        startActivity(intent1);
    }

    public void Video_Player(View view) {
        Intent intent2 = new Intent(MainActivity.this, Video_Player.class);
        startActivity(intent2);
    }
}
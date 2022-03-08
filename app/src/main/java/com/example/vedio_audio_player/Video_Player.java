package com.example.vedio_audio_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Player extends AppCompatActivity {

    VideoView vedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        vedio = findViewById(R.id.vedio);

        vedio.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.index);
        MediaController controller = new MediaController(this);
        controller.setAnchorView(controller);
        vedio.setMediaController(controller);
    }
}
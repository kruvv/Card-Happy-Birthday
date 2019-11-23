package com.kruvv.mybirthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.happybirthday);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);


    }
    public void onBackPressed() {
        mediaPlayer.stop();
        super.onBackPressed();
    }

    public void onPause () {
        mediaPlayer.stop();
        super.onPause();
    }
}


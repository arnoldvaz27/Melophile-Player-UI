package com.arnoldvaz27.melophileplayerui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity{

    ImageView shuffle,shuffleOff,repeat,repeatOff,play,pause,skipNext,skipPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shuffle = findViewById(R.id.shuffle);
        shuffleOff = findViewById(R.id.shuffle_off);
        repeat = findViewById(R.id.repeat);
        repeatOff = findViewById(R.id.repeat_off);
        play = findViewById(R.id.play);
        skipNext = findViewById(R.id.skip_next);
        skipPrevious = findViewById(R.id.skip_previous);
        pause = findViewById(R.id.Pause);

        shuffleOff.setOnClickListener(v -> {
            shuffleOff.setVisibility(View.INVISIBLE);
            shuffle.setVisibility(View.VISIBLE);
        });

        shuffle.setOnClickListener(v -> {
            shuffle.setVisibility(View.INVISIBLE);
            shuffleOff.setVisibility(View.VISIBLE);
        });

        repeat.setOnClickListener(v -> {
            repeat.setVisibility(View.INVISIBLE);
            repeatOff.setVisibility(View.VISIBLE);
        });

        repeatOff.setOnClickListener(v -> {
            repeatOff.setVisibility(View.INVISIBLE);
            repeat.setVisibility(View.VISIBLE);
        });

        skipNext.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Skipped Option Pressed", Toast.LENGTH_SHORT).show());

        skipPrevious.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Previous Option Pressed", Toast.LENGTH_SHORT).show());

        play.setOnClickListener(v -> {
            play.setVisibility(View.INVISIBLE);
            pause.setVisibility(View.VISIBLE);
        });

        pause.setOnClickListener(v -> {
            pause.setVisibility(View.INVISIBLE);
            play.setVisibility(View.VISIBLE);
        });

    }
}
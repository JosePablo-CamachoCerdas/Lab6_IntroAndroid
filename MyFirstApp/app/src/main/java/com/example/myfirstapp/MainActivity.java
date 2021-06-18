package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp1 = MediaPlayer.create(this,R.raw.cow_sound);
        MediaPlayer mp2 = MediaPlayer.create(this,R.raw.duck_sound);
        MediaPlayer mp3 = MediaPlayer.create(this,R.raw.horse_sound);
        MediaPlayer mp4 = MediaPlayer.create(this,R.raw.lamb_sound);
        MediaPlayer mp5 = MediaPlayer.create(this,R.raw.pig_sound);
        MediaPlayer mp6 = MediaPlayer.create(this,R.raw.rooster_sound);

        // Button 1
        bt1 = (Button) findViewById(R.id.button1);
        final boolean[] next = {false};
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                if (!next[0]) {
                    bt1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next[0] = true;
                } else {
                    bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                    next[0] = false;
                }

            }
        });

        // Button 2
        bt2 = (Button) findViewById(R.id.button4);
        final boolean[] next2 = {false};
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                if (!next2[0]) {
                    bt2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next2[0] = true;
                } else {
                    bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                    next2[0] = false;
                }

            }
        });

        // Button 3
        bt3 = (Button) findViewById(R.id.button2);
        final boolean[] next3 = {false};
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                if (!next3[0]) {
                    bt3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next3[0] = true;
                } else {
                    bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                    next3[0] = false;
                }

            }
        });

        // Button 4
        bt4 = (Button) findViewById(R.id.button);
        final boolean[] next4 = {false};
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                if (!next4[0]) {
                    bt4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next4[0] = true;
                } else {
                    bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                    next4[0] = false;
                }

            }
        });

        // Button 5
        bt5 = (Button) findViewById(R.id.button7);
        final boolean[] next5 = {false};
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                if (!next5[0]) {
                    bt5.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next5[0] = true;
                } else {
                    bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                    next5[0] = false;
                }

            }
        });

        // Button 6
        bt6 = (Button) findViewById(R.id.button8);
        final boolean[] next6 = {false};
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
                if (!next6[0]) {
                    bt6.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next6[0] = true;
                } else {
                    bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                    next6[0] = false;
                }

            }
        });
    }}

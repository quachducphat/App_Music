package com.example.appmusic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtTitle, txtTimeSong, txtTimeTotal;
    SeekBar skSong;
    ImageButton btnPrev, btnPlay, btnStop, btnNext;

    ArrayList<Song> arraySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        AddSong();
    }

    private void AddSong(){
        arraySong = new ArrayList<>();
//        arraySong.add(new Song());
    }
    private void AnhXa(){
        txtTimeSong     = (TextView)  findViewById(R.id.TextViewTimeSong);
        txtTimeTotal    = (TextView)  findViewById(R.id.TextViewTimeSongTotal);
        txtTitle        = (TextView)  findViewById(R.id.Textview);
        skSong          = (SeekBar) findViewById(R.id.SeekBarSong);
        btnNext         = (ImageButton) findViewById(R.id.ImageButtonNext);
        btnPrev         = (ImageButton) findViewById(R.id.ImageButtonPre);
        btnPlay         = (ImageButton) findViewById(R.id.ImageButtonPlay);
        btnStop         = (ImageButton) findViewById(R.id.ImageButtonStop);
    }

}
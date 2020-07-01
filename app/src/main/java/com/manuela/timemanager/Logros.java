package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Logros extends AppCompatActivity {

    MediaPlayer md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logros);
    }

    public void logro1(View View) {
        Intent logro1 = new Intent(this, Logro1.class);
        startActivity(logro1);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro2(View View) {
        Intent logro2 = new Intent(this, Logro2.class);
        startActivity(logro2);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro3(View View) {
        Intent logro3 = new Intent(this, Logro3.class);
        startActivity(logro3);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro4(View View) {
        Intent logro4 = new Intent(this, Logro4.class);
        startActivity(logro4);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro5(View View) {
        Intent logro5 = new Intent(this, Logro5.class);
        startActivity(logro5);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro6(View View) {
        Intent logro6 = new Intent(this, Logro6.class);
        startActivity(logro6);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro7(View View) {
        Intent logro7 = new Intent(this, Logro7.class);
        startActivity(logro7);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro8(View View) {
        Intent logro8 = new Intent(this, Logro8.class);
        startActivity(logro8);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro9(View View) {
        Intent logro9 = new Intent(this, Logro9.class);
        startActivity(logro9);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro10(View View) {
        Intent logro10 = new Intent(this, Logro10.class);
        startActivity(logro10);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro11(View View) {
        Intent logro11 = new Intent(this, Logro11.class);
        startActivity(logro11);
        MediaPlayer.create(this, R.raw.pop);
    }

    public void logro12(View View) {
        Intent logro12 = new Intent(this, Logro12.class);
        startActivity(logro12);
        MediaPlayer.create(this, R.raw.pop);
    }
}
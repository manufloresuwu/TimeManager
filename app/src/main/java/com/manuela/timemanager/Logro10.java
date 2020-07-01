package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Logro10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logro10);
    }

    public void Share(View View) {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("Text/plain");
        String shareBody = "Your Body here";
        String sharesub = "Your Subject here";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(myIntent.createChooser(myIntent, "Comparte con Amigos"));
        MediaPlayer.create(this, R.raw.pop);

    }
}
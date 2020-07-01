package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.manuela.timemanager.R.id.ibt1;
import static com.manuela.timemanager.R.id.image;

public class Logros extends AppCompatActivity {

    MediaPlayer md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logros);

        ImageButton ibt1;
        ImageButton ibt2;
        ImageButton ibt3;
        ImageButton ibt4;
        ImageButton ibt5;
        ImageButton ibt6;
        ImageButton ibt7;
        ImageButton ibt8;
        ImageButton ibt9;
        ImageButton ibt10;
        ImageButton ibt11;
        ImageButton ibt12;
        ibt1 = (ImageButton) findViewById(R.id.ibt1);
        ibt2 = (ImageButton) findViewById(R.id.ibt2);
        ibt3 = (ImageButton) findViewById(R.id.ibt3);
        ibt4 = (ImageButton) findViewById(R.id.ibt4);
        ibt5 = (ImageButton) findViewById(R.id.ibt5);
        ibt6 = (ImageButton) findViewById(R.id.ibt6);
        ibt7 = (ImageButton) findViewById(R.id.ibt7);
        ibt8 = (ImageButton) findViewById(R.id.ibt8);
        ibt9 = (ImageButton) findViewById(R.id.ibt9);
        ibt10 = (ImageButton) findViewById(R.id.ibt10);
        ibt11 = (ImageButton) findViewById(R.id.ibt11);
        ibt12 = (ImageButton) findViewById(R.id.ibt12);
        md = MediaPlayer.create(this,R.raw.pop);


        ibt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });

        ibt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                Intent logro1 = new Intent(Logros.this, Logro1.class);
                startActivity(logro1);
            }
        });


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
package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    MediaPlayer mp;



    int hora, minutos, t = 0;
    int max=12;
    int horas[]=new int[max];
    int minutes[]=new int[max];
    String a,b;
    String textos[]=new String[max];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        mp = MediaPlayer.create(this,R.raw.pop);

        Button logros = (Button) findViewById(R.id.logros);
        Button plus =  (Button) findViewById(R.id.plus);
        Button cosas = (Button) findViewById(R.id.todo);
        ImageButton ok = (ImageButton) findViewById(R.id.ahok);

        final Bundle datos = this.getIntent().getExtras();
        final String txt[] = datos.getStringArray("tex");
        final int tasks = datos.getInt("tareas");
        final int hora[] = datos.getIntArray("hora");
        final int minutos[] = datos.getIntArray("minutos");
        cosas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                mp.start();
                Intent intent= new Intent (CalendarActivity.this, ThingsToDoActivity.class);
                intent.putExtra("tex", tasks);
                intent.putExtra("hora", hora);
                intent.putExtra("minutos", minutos);
                intent.putExtra("tareas", t);
                startActivity(intent);
        }
    });
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                mp.start();
                Intent intent= new Intent (CalendarActivity.this, AddTaskActivity.class);
                intent.putExtra("tex", tasks);
                intent.putExtra("hora", hora);
                intent.putExtra("minutos", minutos);
                intent.putExtra("tareas", t);
                startActivity(intent);
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarActivity.this, Configurations.class);
                startActivity(intent);
            }
        });

        logros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (CalendarActivity.this, Logros.class);
                startActivity(intent);
            }
        });
    }
}
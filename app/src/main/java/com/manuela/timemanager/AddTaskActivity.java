package com.manuela.timemanager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddTaskActivity extends AppCompatActivity {

    TimePicker timer;
    int hora, minutos, t = 0;
    String texto = "";
    EditText txt;
    private ThingsToDoActivity todo;

    public AddTaskActivity(){
         //this.hora=hora;
         //this.minutos=minutos;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button Bok = (Button) findViewById(R.id.ok);
        Button cancel = (Button) findViewById(R.id.cancel);
        txt=(EditText)findViewById(R.id.txt);

        texto = txt.getText().toString();

        timer = (TimePicker) findViewById(R.id.timer);
        timer.setIs24HourView(true);
        timer.setCurrentHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

        hora = timer.getHour();
        minutos = timer.getMinute();

        Bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t++;
                //todo.setTareas(t);
                Intent intent = new Intent(AddTaskActivity.this, ThingsToDoActivity.class);
                startActivity(intent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTaskActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });



    }


    public String getTexto(){
        return texto;
    }
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }

}

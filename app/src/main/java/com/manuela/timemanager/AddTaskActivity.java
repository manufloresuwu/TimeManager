package com.manuela.timemanager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddTaskActivity extends AppCompatActivity {

    TimePicker timer;
    int hora, minutos, t = 0;
    String texto = "";
    EditText txt;
    String aux;
    private ThingsToDoActivity todo;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button Bok = (Button) findViewById(R.id.ok);
        Button cancel = (Button) findViewById(R.id.cancel);
        txt=(EditText)findViewById(R.id.txt);

        //texto = getIntent().getExtras().getString(txt.getText().toString());

        timer = (TimePicker) findViewById(R.id.timer);
        timer.setIs24HourView(true);
        timer.setCurrentHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

        hora = timer.getHour();
        minutos = timer.getMinute();

        aux = txt.getText().toString();

        Bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t++;
                //todo.setTareas(t);

                Toast toast2 = Toast.makeText(getApplicationContext(),
                                "hora: "+hora+":"+minutos, Toast.LENGTH_SHORT);

                toast2.setGravity(Gravity.CENTER| Gravity.LEFT,0,0);

                toast2.show();

                Intent intent = new Intent(AddTaskActivity.this, ThingsToDoActivity.class);
                intent.putExtra("tex", aux);
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

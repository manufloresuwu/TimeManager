package com.manuela.timemanager;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
    int max=12;
    int codigo = 0;
    int horas[]=new int[max];
    int minutes[]=new int[max];

    String texto = "";
    String textos[]=new String[max];
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


        timer = (TimePicker) findViewById(R.id.timer);
        timer.setIs24HourView(true);
        timer.setCurrentHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

        hora = timer.getHour();
        minutos = timer.getMinute();



        Bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast2 = Toast.makeText(getApplicationContext(),
                        "Añadido a la hora: "+hora+":"+minutos, Toast.LENGTH_SHORT);

                toast2.setGravity(Gravity.CENTER| Gravity.LEFT,0,0);
                codigo++;
                Registrar(v);

                toast2.show();
                textos[t]=txt.getText().toString();
                horas[t]=hora;
                minutes[t]=minutos;
                Intent intent = new Intent(AddTaskActivity.this, ThingsToDoActivity.class);
                intent.putExtra("tex", textos);
                intent.putExtra("hora", horas);
                intent.putExtra("minutos",minutes);
                intent.putExtra("tareas", t);
                t++;
                startActivity(intent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTaskActivity.this, CalendarActivity.class);
                textos[t]=txt.getText().toString();
                horas[t]=hora;
                minutes[t]=minutos;
                intent.putExtra("tex", textos);
                intent.putExtra("hora", horas);
                intent.putExtra("minutos",minutes);
                intent.putExtra("tareas", t);
                startActivity(intent);
            }
        });

    }


    public void Registrar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String nombre = txt.getText().toString();
        String tiempo = hora+":"+minutos;

        if(!nombre.isEmpty() && !tiempo.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("codigo", codigo);
            registro.put("nombre", nombre);
            //registro.put("tiempo", tiempo);

            BaseDeDatos.insert("actividades", null, registro);
            BaseDeDatos.close();

            Toast.makeText(this,"Registro exitoso", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class General extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sigueinte(View View) {
        Intent siguiente = new Intent(this, EditarInformacion.class);
        startActivity(siguiente);
    }

    public void sigueinte2(View View) {
        Intent siguiente2 = new Intent(this, Notificaciones.class);
        startActivity(siguiente2);
    }
}
package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Configurations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurations);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void general(View View) {
        Intent general = new Intent(this, General.class);
        startActivity(general);
    }
    public void information(View View) {
        Intent information = new Intent(this, InformationUs.class);
        startActivity(information);
    }
    public void perfil(View View) {
        Intent perfil = new Intent(this, ProfileActivity.class);
        startActivity(perfil);
    }
    public void usuario(View View) {
        Intent usuario = new Intent(this, RegisterActivity.class);
        startActivity(usuario);
    }
}
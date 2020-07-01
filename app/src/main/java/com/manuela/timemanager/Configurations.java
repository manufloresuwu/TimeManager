package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Configurations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurations);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MaterialButton a = (MaterialButton) findViewById(R.id.bti);
        MaterialButton b = (MaterialButton) findViewById(R.id.btc);
        MaterialButton c = (MaterialButton) findViewById(R.id.btnew);
        MaterialButton d = (MaterialButton) findViewById(R.id.general);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent general = new Intent(Configurations.this, General.class);
                startActivity(general);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent information = new Intent(Configurations.this, InformationUs.class);
                startActivity(information);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(Configurations.this, ProfileActivity.class);
                startActivity(perfil);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent usuario = new Intent(Configurations.this, RegisterActivity.class);
                startActivity(usuario);
            }
        });
    }
}
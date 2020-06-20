package com.manuela.timemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        mp = MediaPlayer.create(this,R.raw.pop);

        Button plus =  (Button) findViewById(R.id.plus);

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp.start();
                Intent intent= new Intent (CalendarActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}

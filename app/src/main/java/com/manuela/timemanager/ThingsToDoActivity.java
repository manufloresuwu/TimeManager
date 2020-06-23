package com.manuela.timemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class ThingsToDoActivity extends AppCompatActivity {
    List<Row> rows;
    int max = 12;
    int horas[]=new int[max];
    int minutes[]=new int[max];
    String textos[]=new String [max];
    private ListView listView;
    private AddTaskActivity addT;
    public ThingsToDoActivity(){
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_layout);
        listView = (ListView) findViewById(android.R.id.list);
        Bundle datos = this.getIntent().getExtras();
        String txt[] = datos.getStringArray("tex");
        int tasks = datos.getInt("tareas");
        int hora[] = datos.getIntArray("hora");
        int minutos[] = datos.getIntArray("minutos");

        rows = new ArrayList<Row>(10);
        Row row = null;
        for (int i = 0; i < tasks+1; i++) {
            if(txt!=null){
                row = new Row();
                row.setTitle("Title: " + txt[i] );
                row.setSubtitle("at: " + hora[i] + ":" + minutos[i]);
                rows.add(row);
            }
        }
//        rows.get(3).setChecked(true);

        listView.setAdapter(new CustomArrayAdapter(this, rows));

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThingsToDoActivity.this,
                        rows.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
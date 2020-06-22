package com.manuela.timemanager;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class ThingsToDoActivity extends AppCompatActivity {
    List<Row> rows;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_layout);
        listView = (ListView) findViewById(android.R.id.list);

        rows = new ArrayList<Row>(10);
        Row row = null;
        for (int i = 1; i < 11; i++) {
            row = new Row();
            row.setTitle("Title " + i);
            row.setSubtitle("Subtitle " + i);
            rows.add(row);
        }
        rows.get(3).setChecked(true);
        rows.get(6).setChecked(true);
        rows.get(9).setChecked(true);

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
package com.manuela.timemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
            row=new Row();
            Buscar(i+1,row);
        }

        listView.setAdapter(new CustomArrayAdapter(this, rows));

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThingsToDoActivity.this,
                        rows.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Buscar(int codigo, Row row){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase BaseDeDatabase = admin.getWritableDatabase();

        if(codigo!=0){
            Cursor fila = BaseDeDatabase.rawQuery
                    ("select nombre from actividades where codigo =" + codigo, null);
            if(fila.getCount() >= 1){
                while(fila.moveToNext()){
                row.setTitle("Title: " +fila.getString(0));
              //row.setSubtitle("at: " +fila.getString(1));
                rows.add(row);
                BaseDeDatabase.close();
                }
                Toast.makeText(this,"HOLA KK", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "ID = ERROR", Toast.LENGTH_SHORT).show();
        }
    }
}
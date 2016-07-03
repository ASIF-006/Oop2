package com.example.alasif.oop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Poet> ob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.sampleListView);
        Poet poet = new Poet();
        ob = new ArrayList<Poet>();
        ob = poet.allpoets();

        ArrayAdapter<Poet> adapter = new ArrayAdapter<Poet>(this, R.layout.listrow, R.id.listRowTextView, ob);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Next2.class);

                String a = ob.get(position).getName();
                String b = ob.get(position).getDescription();
                intent.putExtra("nam",a);
                intent.putExtra("des",b);

                startActivity(intent);
            }
        });
    }
}

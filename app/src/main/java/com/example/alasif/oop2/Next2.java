package com.example.alasif.oop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Next2 extends AppCompatActivity {

    TextView name, description ;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);

        name = (TextView) findViewById(R.id.poetNameTextView);
        description = (TextView) findViewById(R.id.poetDescriptionTextView);
        btnBack = (Button) findViewById(R.id.previousButton);


        name.setText(getIntent().getStringExtra("nam"));
        description.setText(getIntent().getStringExtra("des"));


    }

    public void prev(View view) {
        Intent intent = new Intent(Next2.this, MainActivity.class);
        startActivity(intent);
    }
}

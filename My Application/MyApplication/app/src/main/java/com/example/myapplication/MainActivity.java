package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        ImageView botton_activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botton_activity_main = findViewById(R.id.botton_activity_main);
        botton_activity_main.setOnClickListener((new View.OnClickListener());
    }

    public  void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), historia.class);
        startActivity(intent);
    }


}
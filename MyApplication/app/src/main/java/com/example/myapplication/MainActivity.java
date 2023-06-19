package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Historia = findViewById(R.id.btnTelaHistoria);
        Historia.setOnClickListener(v -> {
            Intent nomeintent = new Intent(MainActivity.this, historia.class);
            startActivity(nomeintent);

        });

        Button Veiculos = findViewById(R.id.btnTelaVeiculos);
        Veiculos.setOnClickListener(v -> {
            Intent nomeintent = new Intent(MainActivity.this, Veiculos.class);
            startActivity(nomeintent);

        });

        Button Codigos = findViewById(R.id.btnTelaCodigos);
        Historia.setOnClickListener(v -> {
            Intent nomeintent = new Intent(MainActivity.this, Codigos.class);
            startActivity(nomeintent);

        });

        Button Mapa = findViewById(R.id.btnTelaMapa);
        Historia.setOnClickListener(v -> {
            Intent nomeintent = new Intent(MainActivity.this, mapa.class);
            startActivity(nomeintent);

        });

        Button Armas = findViewById(R.id.btnTelaArmas);
        Historia.setOnClickListener(v -> {
            Intent nomeintent = new Intent(MainActivity.this, armas1.class);
            startActivity(nomeintent);

        });
    }
 }
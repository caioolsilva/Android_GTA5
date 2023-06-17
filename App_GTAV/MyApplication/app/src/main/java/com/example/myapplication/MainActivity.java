package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void irParaTelaMapa(View view){
        Intent novaTela = new Intent(MainActivity.this, mapa.class);
        startActivity(novaTela);
    }
    public void irParaTelaHistoria(View view){
        Intent novaTela = new Intent(MainActivity.this, historia.class);
        startActivity(novaTela);
    }

    public void irParaTelaArmas(View view){
        Intent novaTela = new Intent(MainActivity.this, armas1.class);
        startActivity(novaTela);
    }

    public void irParaTelaVeiculos(View view){
        Intent novaTela = new Intent(MainActivity.this, Veiculos.class);
        startActivity(novaTela);
    }

    public void irParaTelaCodigos(View view){
        Intent novaTela = new Intent(MainActivity.this, Codigos.class);
        startActivity(novaTela);
    }

    public void irParaSiteTrailer(View view) {
        Uri uri= Uri.parse("https://www.youtube.com/watch?v=QkkoHAzjnUs");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

 }
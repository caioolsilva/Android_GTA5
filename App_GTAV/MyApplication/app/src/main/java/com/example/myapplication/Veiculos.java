package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Veiculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculos);
    }

    public void irParaSiteVeiculos(View view) {
        Uri uri= Uri.parse("https://gta.fandom.com/pt/wiki/Categoria:Veículos_do_GTA_V");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
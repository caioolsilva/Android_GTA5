package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
    }

    public void irParaSiteMapa(View view) {
        Uri uri= Uri.parse("https://tecnoblog.net/responde/10-easter-eggs-curiosos-em-gta-v/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
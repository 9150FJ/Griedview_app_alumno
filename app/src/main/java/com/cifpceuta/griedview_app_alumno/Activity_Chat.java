package com.cifpceuta.griedview_app_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Chat extends AppCompatActivity {

    TextView chat;
    ImageView portada;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Intent intent = this.getIntent();

        int imagenAvatar = intent.getIntExtra("portada",0);
        String nombre = intent.getStringExtra("nombre");


        chat = (TextView) findViewById(R.id.nombre);
        portada = (ImageView) findViewById(R.id.portada);
    }
}
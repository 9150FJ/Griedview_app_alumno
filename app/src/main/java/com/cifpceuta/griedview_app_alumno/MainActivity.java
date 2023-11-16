package com.cifpceuta.griedview_app_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView listaAlumnos;
    private MiArrayAdapterAlumnos adapterAlumnos;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaAlumnos = (GridView) findViewById(R.id.gridViewAlumnos);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(R.drawable.avatar3_chico, "Alfonso"));
        alumnos.add(new Alumno(R.drawable.avatar1_chico, "Roberto"));
        alumnos.add(new Alumno(R.drawable.avatar2_chica, "Rosa"));
        alumnos.add(new Alumno(R.drawable.avatar4_chica, "Lucia"));

        adapterAlumnos = new MiArrayAdapterAlumnos(this, alumnos);
        listaAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Alumno alumnos = (Alumno) adapterAlumnos.getItem(position);
                Toast.makeText(view.getContext(), "Alumno: " + alumnos.getNombre(), Toast.LENGTH_LONG).show();
                intent(view, position);
            }
        });

        listaAlumnos.setAdapter(adapterAlumnos);

    }

    public void intent(View view, int position) {
        Intent i = new Intent(this, Activity_Chat.class); //Falta crear un xml chat
        i.putExtra("portada", adapterAlumnos.getItem(position).getImagenAlumno());
        i.putExtra("nombre", adapterAlumnos.getItem(position).getNombre());
        startActivity(i);

    }

}

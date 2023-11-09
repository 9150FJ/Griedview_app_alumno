package com.cifpceuta.griedview_app_alumno;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiArrayAdapterAlumnos extends ArrayAdapter<Alumno> {

    private Activity context;
    ArrayList<Alumno> alumnos;

    public MiArrayAdapterAlumnos(Activity c, ArrayList<Alumno> alumnos) {
        super(c,R.layout.activity_alumno,alumnos);
        this.context=c;
        this.alumnos=alumnos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_alumno,parent,false);
        Alumno alumno = alumnos.get(position);
        TextView nombre;
        ImageView imagenAlumno;
        nombre=(TextView) rowView.findViewById(R.id.tvNombreAlumno);
        imagenAlumno=(ImageView) rowView.findViewById(R.id.imagenAlumno);
        imagenAlumno.setImageResource(alumno.getImagenAlumno());
        nombre.setText(alumno.getNombre());
        return rowView;
    }
}

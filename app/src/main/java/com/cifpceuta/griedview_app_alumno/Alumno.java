package com.cifpceuta.griedview_app_alumno;

public class Alumno {
    private int imagenAlumno;
    private String nombre;

    public Alumno(int imagenAlumno, String nombre) {
        this.imagenAlumno = imagenAlumno;
        this.nombre = nombre;
    }

    public int getImagenAlumno() {
        return imagenAlumno;
    }

    public void setImagenAlumno(int imagenAlumno) {
        this.imagenAlumno = imagenAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

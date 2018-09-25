package com.example.sacre.listdual;

import java.util.List;

public class alumno {

    private int id_alumno;

    private List<String> asignaturas_alumno;
    private String nombre_alumno, email_alumno;

    public alumno(int identficador, List<String> asignaturas, String nombre, String email ){
        id_alumno = identficador;
        asignaturas_alumno = asignaturas;
        nombre_alumno = nombre;
        email_alumno = email;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public List<String> getAsignaturas_alumno() {
        return asignaturas_alumno;
    }

    public void setAsignaturas_alumno(List<String> asignaturas_alumno) {
        this.asignaturas_alumno = asignaturas_alumno;
    }

}

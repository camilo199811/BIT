package com.BIT_PROJECTS.Entity;
/*
Clase Marca
 */
public class Marca {
    public Long id;
    public String nombre;
    public int nrDeModelos;
    public String  año_lanzamiento;

    public Marca(Long id, String nombre, int nrDeModelos, String año_lanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.año_lanzamiento = año_lanzamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public String getAño_lanzamiento() {
        return año_lanzamiento;
    }

    public void setAño_lanzamiento(String año_lanzamiento) {
        this.año_lanzamiento = año_lanzamiento;
    }
}

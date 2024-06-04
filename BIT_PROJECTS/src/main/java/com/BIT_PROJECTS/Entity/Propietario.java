package com.BIT_PROJECTS.Entity;

/*
 Clase PROPIETARIO
 */
public class Propietario {
    //Atributos

    public Long id; // Se crea un id para identificar cada propietario
    public String nombre;
    public String fecha_nacimiento;
    public Direccion direccion;

    //Constructor
    public Propietario(Long id, String nombre, String fecha_nacimiento, Direccion direccion) {
        this.id=id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion=direccion;
    }

    //Getters y Setters

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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

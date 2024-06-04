package com.BIT_PROJECTS.Entity;
/*
Clase empleado
 */
public class Empleado {
    public String nombre;
    public String apellido;
    public double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    // Método para obtener el salario por año
    public double getSalarioAnualidad() {
        return salario * 12;
    }

    // Método para aplicar aumento del salario por 10%
    private double aumento=0.10;
    public void aplicarAumento() {
        this.salario += this.salario * aumento;
    }
}

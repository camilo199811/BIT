package com.BIT_PROJECTS.Entity;

/*
Clase factura
 */
public class Factura {
    public String numero;
    public String descripcion;
    public int cantidad_articulo;
    public double precio_articulo;

    public Factura(String numero, String descripcion, int cantidad_articulo, double precio_articulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad_articulo = cantidad_articulo;
        this.precio_articulo = precio_articulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_articulo() {
        return cantidad_articulo;
    }

    public void setCantidad_articulo(int cantidad_articulo) {
        this.cantidad_articulo = cantidad_articulo;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public double getTotalFactura() {
        if (cantidad_articulo <= 0 || precio_articulo <= 0) {
            return 0.0;
        }
        return cantidad_articulo * precio_articulo;
    }
}

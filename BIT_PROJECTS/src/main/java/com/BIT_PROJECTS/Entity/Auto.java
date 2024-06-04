package com.BIT_PROJECTS.Entity;

/*
 Clase Auto
 */
public class Auto {

    public Long id; //Identificador unico del auto
    public String modelo;
    public String color;
    public String ano; //Año
    public Marca marca;

    public String chasis;
    public Propietario propietario; //La clase Auto contiene un propietario asociado

    public int velocidad_maxima;

    public int velocidad_actual;

    public String num_puertos;

    public boolean techo_Solar; //¿ Tiene techo solar?¿ Si o no?

    public int num_marchas; //numero de marchas

    public boolean transmision_automatica; // ¿Tiene transmision Automatica? ¿Si o no?

    public int volumen_combustible; //Volumen de combustible en galones

    public Auto(Long id, String modelo, String color, String ano, Marca marca, String chasis, Propietario propietario, int velocidad_maxima, int velocidad_actual, String num_puertos, boolean techo_Solar, int num_marchas, boolean transmision_automatica,int volumen_combustible) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidad_maxima = velocidad_maxima;
        this.velocidad_actual = velocidad_actual;
        this.num_puertos = num_puertos;
        this.techo_Solar = techo_Solar;
        this.num_marchas = num_marchas;
        this.transmision_automatica = transmision_automatica;
        this.volumen_combustible=volumen_combustible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public int getVelocidad_actual() {
        return velocidad_actual;
    }

    public void setVelocidad_actual(int velocidad_actual) {
        this.velocidad_actual = velocidad_actual;
    }

    public String getNum_puertos() {
        return num_puertos;
    }

    public void setNum_puertos(String num_puertos) {
        this.num_puertos = num_puertos;
    }

    public boolean isTecho_Solar() {
        return techo_Solar;
    }

    public void setTecho_Solar(boolean techo_Solar) {
        this.techo_Solar = techo_Solar;
    }

    public int getNum_marchas() {
        return num_marchas;
    }

    public void setNum_marchas(int num_marchas) {
        this.num_marchas = num_marchas;
    }

    public boolean isTransmision_automatica() {
        return transmision_automatica;
    }

    public void setTransmision_automatica(boolean transmision_automatica) {
        this.transmision_automatica = transmision_automatica;
    }

    public int getVolumen_combustible() {
        return volumen_combustible;
    }

    public void setVolumen_combustible(int volumen_combustible) {
        this.volumen_combustible = volumen_combustible;
    }
}

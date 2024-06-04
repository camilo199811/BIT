package com.BIT_PROJECTS.Entity;

import com.BIT_PROJECTS.DTO.Mensaje;

/*
Clase IntegerSet
 */
public class IntegerSet {
    private boolean[] valor;

    //Contructor que inicializa los valores en false
    public IntegerSet(boolean[] valorInicial){
        this.valor = valorInicial;
    }
    public IntegerSet(){
        valor=new boolean[101];
    }


    public IntegerSet(int size) {
        this.valor = new boolean[size];
    }
    public boolean[] getValor() {
        return valor;
    }

    public void setValor(boolean[] valor) {
        this.valor = valor;
    }

    // Método para insertar un elemento en el conjunto
    public Mensaje insertElement(int k) {
        Mensaje respuesta=new Mensaje();

        if (k >= 0 && k <= 100) {
            valor[k] = true;
            respuesta.setExitoso(true);
        } else {
           respuesta.setExitoso(false);
        }
        return respuesta;
    }




    // Método para obtener una representación legible del conjunto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= 100; i++) {
            if (valor[i]) {
                sb.append(i).append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Elimina la coma y el espacio adicionales al final
        }
        sb.append("]");
        return sb.toString();
    }
}

package com.BIT_PROJECTS.Service.Implementation;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.IntegerSet;
import com.BIT_PROJECTS.Service.IintegerSetService;
import org.springframework.stereotype.Service;

@Service
public class IntegerSetService implements IintegerSetService {


    @Override
    public IntegerSet unionIntegerSet(IntegerSet otherSet1, IntegerSet otherSet2) {
        int maxLength = Math.max(otherSet1.getValor().length, otherSet2.getValor().length);

        // Crear un nuevo conjunto con la longitud máxima
        IntegerSet unionSet = new IntegerSet(maxLength);

        // Aplicar la operación lógica OR en cada posición de ambos conjuntos
        for (int i = 0; i < maxLength; i++) {
            // Obtener el valor de cada conjunto (o falso si el índice está fuera del rango del conjunto)
            boolean value1 = i < otherSet1.getValor().length ? otherSet1.getValor()[i] : false;
            boolean value2 = i < otherSet2.getValor().length ? otherSet2.getValor()[i] : false;

            // Asignar el valor resultante al conjunto de unión
            unionSet.getValor()[i] = value1 || value2;
        }

        return unionSet;
    }

    @Override
    public IntegerSet intersectionIntegerSet(IntegerSet otherSet1, IntegerSet otherSet2) {
        int maxLength = Math.min(otherSet1.getValor().length, otherSet2.getValor().length);

        // Crear un nuevo conjunto con la longitud mínima
        IntegerSet intersectionSet = new IntegerSet(maxLength);

        // Aplicar la operación lógica AND en cada posición de ambos conjuntos
        for (int i = 0; i < maxLength; i++) {
            // Obtener el valor de cada conjunto
            boolean value1 = otherSet1.getValor()[i];
            boolean value2 = otherSet2.getValor()[i];

            // Asignar el valor resultante al conjunto de intersección
            intersectionSet.getValor()[i] = value1 && value2;
        }

        return intersectionSet;
    }

    @Override
    public void insertElement(int k) {
        boolean[] valor = new boolean[3];
        System.out.print("Arreglo inicial: [");
        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i]);
            if (i < valor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Crear un nuevo objeto IntegerSet y establecer el valor del arreglo
        IntegerSet arreglo = new IntegerSet();
        arreglo.setValor(valor);

        if (k < 0 || k >= valor.length) {
            // Mostrar un mensaje de error o lanzar una excepción según sea necesario
            System.out.println("El valor " + k + " está fuera del rango del conjunto.");
            return;
        }

        // Establecer el valor en la posición k como verdadero
        valor[k] = true;

        System.out.print("Arreglo final: [");
        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i]);
            if (i < valor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void deleteElement(int m) {
        boolean[] valor = new boolean[3];
        valor[1]=true;// Suponiendo que el tamaño del conjunto es 3
        System.out.print("Arreglo inicial: [");
        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i]);
            if (i < valor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        if (m < 0 || m >= valor.length) {
            // Mostrar un mensaje de error o lanzar una excepción según sea necesario
            System.out.println("El valor " + m + " está fuera del rango del conjunto.");
            return;
        }

        // Establecer el valor en la posición m como falso
        valor[m] = false;

        System.out.print("Arreglo final: [");
        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i]);
            if (i < valor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    @Override
    public Mensaje equalTo(IntegerSet otherSet1, IntegerSet otherSet2) {
        boolean[] valor1 = otherSet1.getValor();
        boolean[] valor2 = otherSet2.getValor();
        Mensaje respuesta=new Mensaje();
        // Verificar si los tamaños de los conjuntos son iguales
        if (valor1.length != valor2.length) {
            respuesta.setMensaje("El tamaño de los dos conjuntos es diferente");
            respuesta.setExitoso(false);
            return respuesta;
        }

        // Verificar si los elementos de los conjuntos son iguales
        for (int i = 0; i < valor1.length; i++) {
            if (valor1[i] != valor2[i]) {
                respuesta.setMensaje("Los elementos de los dos conjuntos es diferente");
                respuesta.setExitoso(false);
                return respuesta;
            }
        }
        respuesta.setMensaje("Los dos conjuntos son de igual tamaño y sus elementos son iguales");
        respuesta.setExitoso(true);
        return respuesta;

    }


}

package com.BIT_PROJECTS;

import com.BIT_PROJECTS.Entity.Empleado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmpleadoTest {
    @Test
    void testEmpleado(){
        //Se crean dos pbjetos empleados
        Empleado empleado1 = new Empleado("Camilo", "Porras", 13000.00);
        Empleado empleado2 = new Empleado("Maria", "Melgarejo", 35000.00);

        //Imprimimos el salario de los dos empleados
        System.out.println("Salario mensual de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": " + empleado1.getSalario());
        System.out.println("Salario mensual de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": " + empleado2.getSalario());

        // Dar a cada empleado un aumento del 10%
        empleado1.aplicarAumento();
        empleado2.aplicarAumento();

        // Volvemos a mostrar el salario anual de cada empleado
        System.out.println("Salario anual de " + empleado1.getNombre() + " " + empleado1.getApellido() + " después del aumento: " + empleado1.getSalarioAnualidad());
        System.out.println("Salario anual de " + empleado2.getNombre() + " " + empleado2.getApellido() + " después del aumento: " + empleado2.getSalarioAnualidad());

    }
}

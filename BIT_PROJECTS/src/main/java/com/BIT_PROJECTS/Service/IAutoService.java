package com.BIT_PROJECTS.Service;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.Auto;

public interface IAutoService {

    /*
    Ver informacion del vehiculo
     */

    Auto ver_info();

    /*
    Implementar el método de aceleración que aumenta la velocidad de 1 en 1 km/h;
     */
    Mensaje acelarar_Auto();
    /*Implementar el método de frenado que detiene el automóvil – Velocidad = 0
    km/h
     */
    Mensaje frenado(int detener);
    /*
    Implementar el método de cambio de marcha;
    */
    Mensaje cambio_Marcha();

    /*
     Implementar el método reduce la marcha;
     */
    Mensaje reducir_Marcha();

    /*
    Implementar un método que calcule la autonomía de viaje del vehículo en base
     al consumo medio pasado como parámetro
     */
    Mensaje autonomia_viaje(double consumoMedio);

    /*
    Implementar un método para mostrar el volumen de combustible
     */
    Mensaje ver_combustible();
}

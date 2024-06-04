package com.BIT_PROJECTS.Controller;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.Auto;
import com.BIT_PROJECTS.Service.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project1")
public class Project_1_controller {
    @Autowired private IAutoService autoService;

    /*
    Ver informacion del vehiculo
     */
    @GetMapping(path = "/ver", produces = MediaType.APPLICATION_JSON_VALUE)
    public Auto ver() {
        return autoService.ver_info();
    }

    /*
    Implementar el método de aceleración que aumenta la velocidad de 1 en 1 km/h
     */
    @GetMapping(path = "/acelerar", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje acelerar_auto() {
        return autoService.acelarar_Auto();
    }

    /*
    Implementar el método de frenado que detiene el automóvil – Velocidad = 0km/h
     */
    @PostMapping(path = "/detener", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje detener_auto(@RequestParam("detener") int detener) {
        return autoService.frenado(detener);
    }

    /*
     Implementar el método de cambio de marcha
    */
    @GetMapping(path = "/cambiar_marcha", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje cambiar_marcha() {
        return autoService.cambio_Marcha();
    }

    /*
     Implementar el método de disminuir de marcha
    */
    @GetMapping(path = "/disminuir_marcha", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje disminuir_marcha() {
        return autoService.reducir_Marcha();
    }

    /*
    17- Implementar un método que calcule la autonomía de viaje del vehículo
     en base al consumo medio pasado como parámetro;
   */
    @GetMapping(path = "/autonomia_viaje", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje autonomia_viaje(@RequestParam("consumoMedio") double consumoMedio ) {
        return autoService.autonomia_viaje(consumoMedio);
    }

    /*
   Implementar un método para mostrar el volumen de combustible
   */
    @GetMapping(path = "/ver_combustible", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje ver_combustible() {
        return autoService.ver_combustible();
    }
}


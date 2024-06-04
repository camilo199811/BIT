package com.BIT_PROJECTS.Controller;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.Auto;
import com.BIT_PROJECTS.Service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project2")
public class Project_2_controller {
    @Autowired
    IFacturaService facturaService;


    /*
     Calcular el total de la factura
     */
    @GetMapping(path = "/calcularFactura", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mensaje getTotalFatura(@RequestParam("cantidad") int cantidad,@RequestParam("precio") double precio) {
        return facturaService.getTotalFatura(cantidad,precio);
    }
}

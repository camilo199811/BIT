package com.BIT_PROJECTS.Service;

import com.BIT_PROJECTS.DTO.Mensaje;

public interface IFacturaService {
    Mensaje getTotalFatura(int cant_articulos, double precio);
}

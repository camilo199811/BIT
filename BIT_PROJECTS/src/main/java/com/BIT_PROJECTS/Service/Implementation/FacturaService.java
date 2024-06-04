package com.BIT_PROJECTS.Service.Implementation;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.Factura;
import com.BIT_PROJECTS.Service.IFacturaService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacturaService implements IFacturaService {
    @Override
    public Mensaje getTotalFatura(int cant_articulos, double precio) {
        Factura factura= new Factura(
                "123000S","COMPRA ESTABLECIMIENTO Nro.123L",cant_articulos,precio
        );
        Mensaje respuesta= new Mensaje();
        Map<String,String> descripcion_Factura= new HashMap<>();
        descripcion_Factura.put("Numero", factura.getNumero());
        descripcion_Factura.put("Descripcion", factura.getDescripcion());
        double total_factura =0;
        if(cant_articulos>0) {
             total_factura = factura.getCantidad_articulo() * factura.precio_articulo;
            if (total_factura < 0 && factura.getPrecio_articulo() < 0) {
                total_factura = 0;
                factura.setPrecio_articulo(0);
                descripcion_Factura.put("Cantidad Articulos", String.valueOf(factura.getCantidad_articulo()));
                descripcion_Factura.put("Precio Articulo", String.valueOf(factura.getPrecio_articulo()));
                descripcion_Factura.put("Total Factura", String.valueOf(total_factura));
                respuesta.setMensaje(" Su factura es: " + descripcion_Factura);
                respuesta.setExitoso(true);
                return respuesta;
            }

        }else {
            respuesta.setMensaje("La cantidad de articulos debe ser mayor a cero");
            respuesta.setExitoso(false);
            return respuesta;
        }
        descripcion_Factura.put("Cantidad Articulos", String.valueOf(factura.getCantidad_articulo()));
        descripcion_Factura.put("Precio Articulo", String.valueOf(factura.getPrecio_articulo()));
        descripcion_Factura.put("Total Factura",String.valueOf(total_factura));
        respuesta.setMensaje("La factura generada es: "+ descripcion_Factura );
        respuesta.setExitoso(true);
        return respuesta;
    }


}

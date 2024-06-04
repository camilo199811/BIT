package com.BIT_PROJECTS;

import com.BIT_PROJECTS.Entity.Factura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FacturaTest {
    @Test
    public void testTotalFactura() {
        // Crear instancia de Factura
        Factura factura = new Factura("0010", "UNIFORMES", 2, 500.0);

        // Calcular total de factura
        double total = factura.getTotalFactura();

        // Verificación del resultado
        Assertions.assertEquals(1000.0, total);
    }

}

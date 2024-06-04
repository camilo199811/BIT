package com.BIT_PROJECTS.Service.Implementation;

import com.BIT_PROJECTS.DTO.Mensaje;
import com.BIT_PROJECTS.Entity.Auto;
import com.BIT_PROJECTS.Entity.Direccion;
import com.BIT_PROJECTS.Entity.Marca;
import com.BIT_PROJECTS.Entity.Propietario;
import com.BIT_PROJECTS.Service.IAutoService;
import org.springframework.stereotype.Service;

@Service
public class AutoService implements IAutoService {
    @Override
    public Auto ver_info() {
        Auto informacion=iniciar_data();
        return informacion;
    }

    @Override
    public Mensaje acelarar_Auto() {
        Auto data= iniciar_data(); //Iniciamos la data
        int acelarion=1;  //Incrementamos la acelaracion en 1
        while (data.getVelocidad_actual() <= data.getVelocidad_maxima()){
            int incrementar_velocidad= data.getVelocidad_actual() + acelarion;
            data.velocidad_actual=incrementar_velocidad;
            System.out.println("Vamos acelerando, velocidad actual: " + data.getVelocidad_actual() + "km/h");
        }
        Mensaje respuesta= new Mensaje();
        respuesta.setMensaje("El vehiculo ha llegado a su maxima velocidad: " + data.getVelocidad_maxima() + "km/h");
        respuesta.setExitoso(true);
        return respuesta;
    }

    @Override
    public Mensaje frenado(int detener) {
        Auto data=iniciar_data();

        while (data.getVelocidad_actual() >=0 && detener >=0 && detener <= data.getVelocidad_actual()){
            int guardar_velocidad = data.velocidad_actual-detener;
            data.velocidad_actual=guardar_velocidad;
            System.out.println("Vamos a frenar: " + data.getVelocidad_actual() + "KM/H");
        }
        //Controlar si la velocidad aun no esta en 0 km/h
        if(data.getVelocidad_actual() > 0){
            System.out.println("La velocidad actual aun no es 0 KM/h, es de: " + data.getVelocidad_actual() + "KM/H" );
            int detener_cero= data.velocidad_actual- data.velocidad_actual;
            data.velocidad_actual=detener_cero;

            System.out.println("Se ha disminuido a " + data.getVelocidad_actual() + "km/h");
        }

        Mensaje respuesta= new Mensaje();
        respuesta.setMensaje("La velocidad del auto disminuyo a 0 km/h");
        respuesta.setExitoso(true);
        return respuesta;
    }

    @Override
    public Mensaje cambio_Marcha() {
        Auto data= iniciar_data();
        System.out.println("Numero de marchas del vehiculo: " + data.getNum_marchas());
        System.out.println("El vehiculo arranca en la marcha #1");
        int cambiar_marcha= 1;
        if(data != null){
            //Es menor o igual a 5, ya que el numero de marchas es 5 por defecto
            while (cambiar_marcha < 5){
                int cambiar_cambio= cambiar_marcha + 1;
                data.num_marchas=cambiar_cambio;
                cambiar_marcha=cambiar_cambio;
                System.out.println("Vamos en la marcha # " + data.getNum_marchas());
            }
        }
        System.out.println("El vehiculo a alcanzado su maximo numero de marchas");
        Mensaje mensaje=new Mensaje();
        mensaje.setMensaje("Hemos cambiado el numero de marchas");
        mensaje.setExitoso(true);
        return mensaje;
    }

    @Override
    public Mensaje reducir_Marcha() {
        Auto data= iniciar_data();
        System.out.println("Numero de marchas del vehiculo: " + data.getNum_marchas());
        System.out.println("El vehiculo arranca en la marcha # " +  data.getNum_marchas());
        int disminuir_marcha=data.getNum_marchas();
        while (disminuir_marcha>1 && disminuir_marcha <= 5 && data.velocidad_actual > 0){
            int disminuir= disminuir_marcha-1;
            data.num_marchas=disminuir;
            disminuir_marcha=disminuir;
            System.out.println("Disminuimos a la marcha # " + data.getNum_marchas());
        }
        System.out.println("El vehiculo ha llegado a su minimo numero de marchas");
        Mensaje mensaje=new Mensaje();
        mensaje.setMensaje("Hemos disminuido el numero de marchas");
        mensaje.setExitoso(true);
        return mensaje;
    }

    @Override
    public Mensaje autonomia_viaje(double consumoMedio) {
        Auto auto = iniciar_data();
        double volumenCombustible = auto.getVolumen_combustible();
        Mensaje respuesta = new Mensaje();
        if (consumoMedio > 0) {
            // Calcular la autonomía
            double autonomia = (volumenCombustible / consumoMedio) * 100;

            respuesta.setMensaje("La autonomía de viaje del vehículo es: " + autonomia + " km");
            respuesta.setExitoso(true);
        } else {
            respuesta.setMensaje("El consumo medio debe ser mayor a cero");
            respuesta.setExitoso(false);
        }

        return respuesta;
    }

    @Override
    public Mensaje ver_combustible() {
        Auto auto=iniciar_data();
        int volumen_combustible= auto.getVolumen_combustible();
        Mensaje respuesta=new Mensaje();
        respuesta.setMensaje("El volumen de combustible del vehiculo es " + volumen_combustible + " galones");
        respuesta.setExitoso(true);
        return respuesta;
    }

    Auto iniciar_data(){
        Direccion direccion=new Direccion("CALLE 61#10-150","REAL DE MINAS","BUCARAMANGA");
        Propietario propietario=new Propietario(1L,"CAMILO","11/12/1998",direccion);
        Marca marca=new Marca(1L,"TOYOTA",1,"2012");
        Auto auto=new Auto(
                1L,
                "DBX",
                "Azul",
                "2012",
                marca,
                "ANNJSAS",
                propietario,
                30,
                20,
                "4",
                true,
                5,
                false,
                6




        );
        return auto;
    }
}

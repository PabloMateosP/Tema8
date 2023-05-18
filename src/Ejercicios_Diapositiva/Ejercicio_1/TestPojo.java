package Ejercicios_Diapositiva.Ejercicio_1;

import java.math.BigDecimal;
import java.util.Date;

public class TestPojo {
    public static void main(String[] args) {
        String nombre = "Concierto de Paco";
        Date fecha = new Date();
        Date fecha2 = new Date(216, 6, 1); // --> Dará año 2116 del 1 de julio
        //Si en el valor que le queremos dar a la fecha no introducimos nada cogerá la fecha de hoy
        //Por otra parte, tenemos que tener en cuenta de que la fecha empieza a contar desde 1900
        // es decir, si ponemos Date fecha2 = new Date(116, 5,3);
        // El año que cogerá será el 2016. El mes será junio, ya que empieza en 0. Y el día es el que pongamos como último dato.
        BigDecimal recaudacion = new BigDecimal("150000.50");

        POJO_TiposDeDatos evento = new POJO_TiposDeDatos(nombre, fecha, recaudacion);
        POJO_TiposDeDatos evento2 = new POJO_TiposDeDatos(nombre, fecha2, recaudacion);

        // Imprimir los detalles del evento
        System.out.println("Nombre del evento: " + evento.getNombre());
        System.out.println("Fecha del evento: " + evento.getFecha());
        System.out.println("Fecha del evento: " + evento2.getFecha());
        System.out.println("Recaudación del evento: " + evento.getRecaudacion());
    }
}

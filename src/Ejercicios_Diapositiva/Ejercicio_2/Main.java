package Ejercicios_Diapositiva.Ejercicio_2;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de géneros musicales
        String generos1 = String.valueOf(Generos_Musicales.pop);


        // Crear lista de artistas confirmados
        List<Artista> artistas1 = new ArrayList<>();
        artistas1.add(new Artista("Manolo", "Perez", 12));
        artistas1.add(new Artista("Pepe", "Mel", 24));

        // Crear eventos musicales
        Evento_Musical2 evento1 = new Evento_Musical2("Concierto Soto Asa", new Date(115, 3, 1), new BigDecimal(150000.50
        ), generos1, artistas1);

        // Imprimir detalles de los eventos
        System.out.println("Detalles del Evento 1:");
        System.out.println("Nombre del evento: " + evento1.getNombre());
        System.out.println("Fecha del evento: " + evento1.getFecha());
        System.out.println("Recaudación del evento: " + evento1.getRecaudacion());
        System.out.println("Géneros musicales: " + generos1);
    }
}

package Ejercicios_Diapositiva.Ejercicio_2;

import javax.persistence.Id;
import java.io.Serializable;

public class Artista implements Serializable {
    @Id //Así ponemos que esta variable sea la clave primaria
    private String nombre;
    private String apel1;
    private Integer edad;

    public Artista(String nombre, String apel1, Integer edad){
        this.nombre = nombre;
        this.apel1 = apel1;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

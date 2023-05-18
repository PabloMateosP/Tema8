package Ejercicios_Diapositiva.Ejercicio_3;

import Ejercicios_Diapositiva.Ejercicio_2.Artista;
import Ejercicios_Diapositiva.Ejercicio_2.Generos_Musicales;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Ejercicio3 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenciaMasDiez")
    @SequenceGenerator(name = "sequenciaMasDiez", sequenceName = "DB_Evento", allocationSize = 10)
    private Integer id;
    private String nombre;
    @Transient
    private Date fecha;
    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    private Generos_Musicales generoMusical;

    @Embedded
    private List<Artista> artistas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "EventoMusical{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", generoMusical=" + generoMusical +
                ", artistas=" + artistas +
                '}';

    }
}

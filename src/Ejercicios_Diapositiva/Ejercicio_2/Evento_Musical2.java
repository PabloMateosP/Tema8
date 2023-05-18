package Ejercicios_Diapositiva.Ejercicio_2;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Evento_Musical2 implements Serializable {
    private String nombre;
    @Transient //Usamos el @Transient para que los campos de tipo persistente no se almacenen.
    private Date fecha;
    private BigDecimal recaudacion;
    List<Artista> artistasConfirmados;
    Generos_Musicales generosMusicales;

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
    public Evento_Musical2(){

    }
    public Evento_Musical2(String nombre, Date fecha, BigDecimal recaudacion, String generoMusical,
                         List<Artista> artistasConfirmados) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.generosMusicales = generosMusicales;
        this.artistasConfirmados = artistasConfirmados;
    }
}

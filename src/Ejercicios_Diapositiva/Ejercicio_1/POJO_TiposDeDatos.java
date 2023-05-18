package Ejercicios_Diapositiva.Ejercicio_1;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class POJO_TiposDeDatos implements Serializable {
    //Crea un POJO que represente un evento musical. Deberá tener los campos para guardar el nombre del evento, la fecha, la recaudación.
    //Establece el tipo más adecuado para cada atributo.

    //Responde a las siguientes cuestiones:
        //- ¿Cuándo conviene usar BigInteger en lugar de Integer?
        // Es conveniente usar BigInteger en vez de Integer cuando los valores a guardar sean mucho mayores que la capacidad de Integer

        //- ¿Para qué sirve cada uno de los tipos: Date, Time, Timestamp y Calendar?
        // Date para introducir la fecha en día, Time para introducir la hora, Timestamp para guardar fecha y hora y calendar para guardar todos los datos por completo

    private String nombre;
    private Date fecha;
    private BigDecimal recaudacion;
    public BigDecimal getRecaudacion() {
        return recaudacion;
    }
    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }
    public POJO_TiposDeDatos(String nombre, Date fecha, BigDecimal recaudacion){
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }
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
}

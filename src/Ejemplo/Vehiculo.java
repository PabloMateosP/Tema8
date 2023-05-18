package Ejemplo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Vehiculo implements Serializable {
    @Id
    private Integer id;
    private Integer numeroRuedas;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", numeroRuedas=" + numeroRuedas +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}
package Ejemplo;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name="queryEstatica", query="SELECT c FROM cochecito c")
@Entity(name = "cochecito")
public class Coche extends Vehiculo implements Serializable {
    @Embedded
    private Fabricante fabricante;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "referenciaSeq")
    @SequenceGenerator(initialValue = 50, allocationSize = 10, name = "referenciaSeq")
    private Integer referencia;
    private String color;

    private String marca;


    public Coche() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante=" + fabricante +
                ", referencia=" + referencia +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

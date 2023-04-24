import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Coche implements Serializable {
    private String color;
    private String marca;
    private int numPuertas;
    public Coche(){

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

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
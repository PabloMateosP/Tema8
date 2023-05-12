package EjerciciosMoodle.Actividad8_1;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Embeddable
public class Especificaciones {
    BigInteger memoria;
    BigInteger disco_duro;
    String cpu;
    Date fecha_compra;

    public BigInteger getMemoria() {
        return memoria;
    }

    public void setMemoria(BigInteger memoria) {
        this.memoria = memoria;
    }

    public BigInteger getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(BigInteger disco_duro) {
        this.disco_duro = disco_duro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }


}

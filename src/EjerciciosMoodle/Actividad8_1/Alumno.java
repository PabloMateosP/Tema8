package EjerciciosMoodle.Actividad8_1;

public class Alumno extends Persona{
    private String clase;
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    Alumno(String nombre, String clase) {
        super(nombre);
        this.clase = clase;
    }
}

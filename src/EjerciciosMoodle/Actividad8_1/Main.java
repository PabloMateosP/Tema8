package EjerciciosMoodle.Actividad8_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/Alumnos");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Alumno pepe = new Alumno("Pepe", "1Daw");
        Alumno julian = new Alumno("Julian", "1Daw");
        Alumno pablo = new Alumno("Pablo", "1Daw");
        Alumno juanMaria = new Alumno("JuanMaria", "1Daw");
        Alumno victor = new Alumno("Victor", "1Daw");
        Alumno juanManuelSaborido = new Alumno("JuanManuelSaborido", "1Daw");
        Alumno juanManuelHerrera = new Alumno("JuanManuelHerrera", "1Daw");
        Alumno daniel = new Alumno("Daniel", "1Daw");
        Alumno jonathan = new Alumno("Jonathan", "1Daw");
        Alumno diego = new Alumno("Diego", "1Daw");
        Alumno david = new Alumno("David", "1Daw");
        Alumno ricardo = new Alumno("Ricardo", "1Daw");
        Alumno antonio = new Alumno("Antonio", "1Daw");
        Alumno jorge = new Alumno("Jorge", "1Daw");



    }
}

package EjerciciosMoodle.Actividad8_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/Alumnos.odb");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Alumno> querydinamic= em.createQuery("SELECT a FROM Alumno a WHERE nombre LIKE ?1", Alumno.class);
        querydinamic.setParameter(1,"P%");
        //Debe de mostrar aquellos alumnos que su nombre empiece por P
        List<Alumno> Alumno = querydinamic.getResultList();
        System.out.println(Alumno);

        TypedQuery<Alumno> querydinamic2= em.createQuery("SELECT a FROM Ordenador a WHERE NumeroSerie LIKE ?1", Alumno.class);
        querydinamic.setParameter(1,"23423");
        //Debe de mostrar aquellos ordenador que su número de serie sea 23423
        List<Alumno> Alumno2 = querydinamic.getResultList();
        System.out.println(Alumno2);

        em.close();
        emf.close();
    }
}

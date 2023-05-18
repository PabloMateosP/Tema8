package Ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Ejemplo5Delete {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Obtener el coche rojo y lo eliminamos
//        em.getTransaction().begin();
//        Coche cocheToDelete = em.find(Coche.class, 51);
//        em.remove(cocheToDelete);
//        em.getTransaction().commit();

        // Creamos un nuevo coche azulito
        em.getTransaction().begin();
        Coche azulito = new Coche();
        azulito.setColor("Azulito");
        em.persist(azulito);
        em.getTransaction().commit();

        // Utilizando JPQL lo eliminamos
        em.getTransaction().begin();
        Query deleteQuery = em.createQuery("DELETE FROM cochecito WHERE referencia = 51");
        deleteQuery.setParameter(1, azulito.getReferencia());
        System.out.println("Registros eliminados: " + deleteQuery.executeUpdate());
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

    }
}

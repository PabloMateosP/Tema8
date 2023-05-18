package Ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ej3Creacion {
    public static void main(String[] args) {
        // Abrir conexión
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Iniciar la transacción
        em.getTransaction().begin();

        // Operaciones
        Coche c3 = new Coche();
        c3.setColor("Azul");

        Coche c4 = new Coche();
        c4.setColor("Amarillo");
        c4.setMarca("Renault");

        em.persist(c4);

        // No funciona con JPQL
        /*Query queryInsertaCoche = em.createNativeQuery("INSERT INTO c4 (color, marca) values (?, ?)");
        queryInsertaCoche.setParameter(1, c4.getColor());
        queryInsertaCoche.setParameter(2, c4.getMarca());
        int numeroObjetosInsertados = queryInsertaCoche.executeUpdate();*/

        // Finalizar la transacción: salvar la información
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

    }
}

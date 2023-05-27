package Ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Ej4Update {
    public static void main(String[] args) {
        // Abrir conexión
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Iniciar la transacción
        em.getTransaction().begin();

        // Obtener el coche rojo y cambiarle el color a rosa
        Coche cocheToUpdate = em.find(Coche.class, 70);
        cocheToUpdate.setColor("Rosa");

        // Utilizando JPQL
        Query updateQuery = em.createQuery("UPDATE cochecito SET color = 'Rosita' WHERE referencia = 50");
        System.out.println("Registros actualizados: " + updateQuery.executeUpdate());

        // Finalizar la transacción: salvar la información
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

    }
}
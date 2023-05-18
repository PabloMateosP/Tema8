package Ejemplo;

import javax.persistence.*;
import java.util.List;

public class Ej2Read {
    public static void main(String[] args) {
        // Abrir conexión
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // No hace falta iniciar la transacción porque es una operación de lectura

        // Operación de lectura utilizando find
        Coche coche = em.find(Coche.class, 0);
        System.out.println("Coche de color: " + coche.getColor());

        // Query estática que obtiene una lista de resultados
        Query query1 = em.createNamedQuery("queryEstatica");
        List<Coche> coches = query1.getResultList();
        for(Coche c : coches) {
            System.out.println("Coche de color: " + c.getColor());
        }

        // Query dinámica y tipada
        TypedQuery<Coche> query2 = em.createQuery("SELECT c FROM cochecito c WHERE color LIKE ?1", Coche.class);
        query2.setParameter(1, "Rojo");
        Coche coche2 = query2.getSingleResult();
        System.out.println(coche2);

        // Query sin tipado, hay que hacer casting
        Query query3 = em.createQuery("SELECT c FROM cochecito c WHERE color LIKE ?1");
        query3.setParameter(1, "Rojo");
        Coche coche3 = (Coche) query3.getSingleResult();
        System.out.println(coche3);

        // Parámetros se pueden pasar por un ordinal o por un nombre
        TypedQuery query4 = em.createQuery("SELECT c FROM cochecito c " +
                "WHERE color LIKE :color", Coche.class);
        query4.setParameter("color", "R%");
        List<Coche> coches3 = query4.getResultList();
        System.out.println("Coche de color: " + coches3.get(0).getColor());

        // Cerrar conexión
        em.close();
        emf.close();

    }
}

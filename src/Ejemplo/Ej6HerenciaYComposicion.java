package Ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ej6HerenciaYComposicion {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Un Coche es un Vehículo (Entity) y tiene un Fabricante (Embedded)
        Fabricante seatEspana = new Fabricante("SeatEspana","España");
        Coche coche = new Coche();
        coche.setFabricante(seatEspana);
        coche.setMarca("Seat");
        coche.setColor("Turquesa");
        coche.setNumeroRuedas(4);

        em.persist(coche);

        // Finalizar la transacción: salvar la información
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

    }
}

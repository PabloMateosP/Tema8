package Ejercicios_Diapositiva.Ejercicio_5;

import Ejercicios_Diapositiva.Ejercicio_2.Evento_Musical2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        //Crea una instancia de EntityManagerFactory utilizando la configuración definida en el archivo de persistencia.
        EntityManager em = emf.createEntityManager();
        //Entity manager se utiliza para realizar las operaciones de persistencia en la base de datos,
        // como guardar objetos en la base de datos, recuperar objetos existentes, ejecutar consultas, etc.

        em.getTransaction().begin();

        Evento_Musical2 event = em.find(Evento_Musical2.class, 50);
        System.out.println("Evento " + event.getNombre());

        em.persist(event);

        em.getTransaction().commit();
        //Finalizamos la transacción

        em.close();
        emf.close();
    }
}

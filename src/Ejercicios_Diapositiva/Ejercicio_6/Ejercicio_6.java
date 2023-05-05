package Ejercicios_Diapositiva.Ejercicio_6;

import Ejercicios_Diapositiva.Ejercicio_2.Evento_Musical2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio_6 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/evento.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciamos la transacción
        em.getTransaction().begin();

        Evento_Musical2 eventoToUpdate = em.find(Evento_Musical2.class, 1);
        if (eventoToUpdate == null){
            System.out.println("Evento no encontrado");
        }
        eventoToUpdate.setNombre("Puro Latino");


    }
}

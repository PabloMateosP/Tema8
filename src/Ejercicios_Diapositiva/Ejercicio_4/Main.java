package Ejercicios_Diapositiva.Ejercicio_4;

import Ejercicios_Diapositiva.Ejercicio_2.Evento_Musical2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        //Crea una instancia de EntityManagerFactory utilizando la configuración definida en el archivo de persistencia.
        EntityManager em = emf.createEntityManager();
        //Entity manager se utiliza para realizar las operaciones de persistencia en la base de datos,
        // como guardar objetos en la base de datos, recuperar objetos existentes, ejecutar consultas, etc.

        em.getTransaction().begin();
        //Iniciamos la transacción

        Evento_Musical2 e1 = new Evento_Musical2();
        e1.setFecha(new Date(116, 4, 3));
        e1.setRecaudacion(new BigDecimal(1111111.02));
        e1.setNombre("Cabo de Plata");

        em.persist(e1);

        em.getTransaction().commit();
        //Finalizamos la transacción

        em.close();
        emf.close();

    }
}

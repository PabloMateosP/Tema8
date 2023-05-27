package EjerciciosMoodle.Actividad8_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/Alumnos.odb");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ordenador pc1 = new Ordenador();
        Ordenador pc2 = new Ordenador();
        Ordenador pc3 = new Ordenador();
        Ordenador pc4 = new Ordenador();
        Ordenador pc5 = new Ordenador();
        Ordenador pc6 = new Ordenador();
        Ordenador pc7 = new Ordenador();
        Ordenador pc8 = new Ordenador();
        Ordenador pc9 = new Ordenador();
        Ordenador pc10 = new Ordenador();

        pc1.setIP("192.320.329");
        pc2.setIP("192.320.330");
        pc3.setIP("192.320.331");
        pc4.setIP("192.320.332");
        pc5.setIP("192.320.333");
        pc6.setIP("192.320.334");
        pc7.setIP("192.320.335");
        pc8.setIP("194.320.356");
        pc9.setIP("192.320.393");
        pc10.setIP("192.320.340");
        pc1.setNumeroSerie(23423);
        pc2.setNumeroSerie(23423);
        pc3.setNumeroSerie(23423);
        pc4.setNumeroSerie(23423);
        pc5.setNumeroSerie(23423);
        pc6.setNumeroSerie(23423);
        pc7.setNumeroSerie(23423);
        pc8.setNumeroSerie(23423);
        pc9.setNumeroSerie(23423);


        Alumno Victor = new Alumno();
        Victor.setNombre("Victor");
        Victor.setGrupo("1ºDAW");
        Victor.setOrdenador(pc10);

        Alumno Julian = new Alumno();
        Julian.setNombre("Julian");
        Julian.setGrupo("1ºDAW");
        Julian.setOrdenador(pc8);

        Alumno Diego = new Alumno();
        Diego.setNombre("Diego");
        Diego.setGrupo("1ºDAW");
        Diego.setOrdenador(pc7);

        Alumno Jorge = new Alumno();
        Jorge.setNombre("Jorge");
        Jorge.setGrupo("1ºDAW");
        Jorge.setOrdenador(pc9);

        Alumno JuanmaH = new Alumno();
        JuanmaH.setNombre("JuanmaH");
        JuanmaH.setGrupo("1ºDAW");
        JuanmaH.setOrdenador(pc5);

        Alumno Jonathan = new Alumno();
        Jonathan.setNombre("Jonathan");
        Jonathan.setGrupo("1ºDAW");
        Jonathan.setOrdenador(pc6);

        Alumno Pablo = new Alumno();
        Pablo.setNombre("Pablo");
        Pablo.setGrupo("1ºDAW");
        Pablo.setOrdenador(pc4);

        Alumno JuanMaria = new Alumno();
        JuanMaria.setNombre("JuanMaria");
        JuanMaria.setGrupo("1ºDAW");
        JuanMaria.setOrdenador(pc3);

        Alumno Adrian = new Alumno();
        Adrian.setNombre("Adrian");
        Adrian.setGrupo("1ºDAW");

        Alumno Ricardo = new Alumno();
        Ricardo.setNombre("Ricardo");
        Ricardo.setGrupo("1ºDAW");

        Alumno Pepe = new Alumno();
        Pepe.setNombre("Pepe");
        Pepe.setGrupo("1ºDAW");

        Alumno Dani = new Alumno();
        Dani.setNombre("Dani");
        Dani.setGrupo("1ºDAW");
        Dani.setOrdenador(pc2);

        Alumno David = new Alumno();
        David.setNombre("David");
        David.setGrupo("1ºDAW");

        Alumno JuanmaSab = new Alumno();
        JuanmaSab.setNombre("JuanmaSab");
        JuanmaSab.setGrupo("1ºDAW");
        JuanmaSab.setOrdenador(pc1);

        Alumno Antonio = new Alumno();
        Antonio.setNombre("Anton");
        Antonio.setGrupo("1ºDAW");


        em.persist(pc1);
        em.persist(pc2);
        em.persist(pc3);
        em.persist(pc4);
        em.persist(pc5);
        em.persist(pc6);
        em.persist(pc7);
        em.persist(pc8);
        em.persist(pc9);

        em.persist(Antonio);
        em.persist(Diego);
        em.persist(Dani);
        em.persist(Pablo);
        em.persist(Ricardo);
        em.persist(Adrian);
        em.persist(David);
        em.persist(Victor);
        em.persist(Pepe);
        em.persist(Julian);
        em.persist(Jonathan);
        em.persist(Jorge);
        em.persist(JuanmaSab);
        em.persist(JuanMaria);

        em.getTransaction().commit();
        emf.close();
    }
}

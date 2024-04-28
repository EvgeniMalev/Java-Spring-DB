import entities.Towns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();


        Towns berkovitsa = new Towns();
        town1.setName("Berkovitsa");
        session.save(berkovitsa);

        Towns kula = new Towns();
        town2.setName("Kula");
        session.save(kula);

        Towns radomir = new Towns();
        town2.setName("Radomir");
        session.save(radomir);

        List<Towns> towns = session.createQuery("FROM Towns", Towns.class).list();

        for (Towns current : towns) {
            System.out.println(current);
        }

        session.getTransaction().commit();
        session.close();
    }
}

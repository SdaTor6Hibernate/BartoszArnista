package zadaniaIprzyklady;

import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {
    public static void main(String[] args) {
        useMerge();
        usePersist();
        useUpdate();
    }

    public static void usePersist() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("India");
        newCountry.setAlias("IN");
        System.out.println("Przed Persist");
        session.persist(newCountry);
        System.out.println("Po Persist");
        session.flush();
        System.out.println("Po Flush");
        session.getTransaction().commit();
        System.out.println("Po Commit");
        session.close();
    }
    public static void useMerge() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Spain");
        newCountry.setAlias("ES");
        System.out.println("New Merge");
        session.merge(newCountry);
        System.out.println("After Merge");
        session.flush();
        session.close();
    }

    public static void useUpdate() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country country = new Country();
        country.setCountryId(10);
        country.setName("Japan");
        country.setAlias("JP");
        session.update(country);
        session.flush();
        session.close();

    }
}

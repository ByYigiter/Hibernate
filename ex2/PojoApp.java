package examples.ex2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class PojoApp {

    public static void main(String[] args) {

        Pojo pojo =new Pojo();
        Date date =new Date();

        pojo.setDate(date);
        pojo.setSaat(date);
        pojo.setName("er");

        Configuration cfg =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Pojo.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();

        session.merge(pojo);

        tx.commit();;
        session.close();
        sf.close();

    }
}

package examples.hibernate;

import examples.ex2.Pojo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sf= buildSessionFactory();
    private static SessionFactory buildSessionFactory() {

        try{
            Configuration cfg =new Configuration();
            cfg.addAnnotatedClass(Pojo.class);// HibernateUtil kullanıldıpğında add içerisini daima değiştirmeyi unutma
            SessionFactory sessionFactory=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;

        }catch (Exception e){
            System.out.println("hata oluştu");
            throw new ExceptionInInitializerError(e);
        }

    }
    public static SessionFactory getSf(){
        return sf;
    }
}

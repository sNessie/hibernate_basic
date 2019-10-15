package services;

import models.ExchangeModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManageExchanges {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<ExchangeModel> getExchanges(){
        Session session = factory.openSession(); // open session with db
        Transaction transaction = session.beginTransaction();
        List<ExchangeModel> results = session.createQuery("from ExchangeModel", ExchangeModel.class).list();
        transaction.commit();
        return results;

    }

}

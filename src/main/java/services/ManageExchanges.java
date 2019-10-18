package services;

import models.ExchangeModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManageExchanges {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<ExchangeModel> getExchanges() {
        Session session = factory.openSession(); // open session with db
        Transaction transaction = session.beginTransaction();
        List<ExchangeModel> results = session.createQuery("from ExchangeModel", ExchangeModel.class).list();
        transaction.commit();
        return results;
    }

    public ExchangeModel getExchangeById(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        ExchangeModel result = session.byId(ExchangeModel.class).getReference(id);
        transaction.commit();
        return result;
    }

    public void addExchange(ExchangeModel exchange) {
        Transaction transaction = null;
        try (Session session = factory.openSession();) {
            transaction = session.beginTransaction();
            session.save(exchange);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }

}

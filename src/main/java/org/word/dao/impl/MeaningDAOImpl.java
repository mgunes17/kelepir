package org.word.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.word.dao.MeaningDAO;
import org.word.model.Meaning;

import java.util.List;

/**
 * Created by mustafa on 14.03.2017.
 */

@Repository
public class MeaningDAOImpl implements MeaningDAO {
    private SessionFactory sessionFactory;

    public void saveMeaning(Meaning meaning) {
        Session session = getCurrentSession();
        session.save(meaning);
    }

    public List<Meaning> getAllMeanings() {
        Session session = getCurrentSession();
        return session.createCriteria(Meaning.class).list();
    }

    //getter-setter
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

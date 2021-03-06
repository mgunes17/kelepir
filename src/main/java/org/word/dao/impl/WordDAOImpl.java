package org.word.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.word.dao.WordDAO;
import org.word.model.Word;

import java.util.List;

/**
 * Created by mustafa on 08.03.2017.
 */

@Repository
public class WordDAOImpl implements WordDAO {
    private SessionFactory sessionFactory;

    public void save(Word word) {
        Session session = getCurrentSession();
        session.persist(word);
    }

    public List<Word> getAllWords() {
        Session session = getCurrentSession();
        return session.createCriteria(Word.class).list();
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

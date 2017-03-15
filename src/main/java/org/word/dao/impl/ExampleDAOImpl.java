package org.word.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.word.dao.ExampleDAO;
import org.word.model.Example;

/**
 * Created by mustafa on 14.03.2017.
 */

@Repository
public class ExampleDAOImpl implements ExampleDAO {
    private SessionFactory sessionFactory;

    public void saveExample(Example example) {
        Session session = getCurrentSession();
        session.save(example);
    }

    //getter-setter
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}

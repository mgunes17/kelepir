package org.word.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.word.dao.UsageTypeDAO;
import org.word.model.UsageType;

import java.util.List;

/**
 * Created by mustafa on 10.03.2017.
 */

@Repository
public class UsageTypeDAOImpl implements UsageTypeDAO {
    private SessionFactory sessionFactory;

    public List<UsageType> getAllUsageTypes() {
        Session session = getCurrentSession();
        return session.createCriteria(UsageType.class).list();
    }

    public UsageType getUsageType(String name) {
        Session session = getCurrentSession();
        return session.get(UsageType.class, name);
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}

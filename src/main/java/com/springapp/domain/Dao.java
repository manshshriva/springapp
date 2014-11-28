package com.springapp.domain;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.TransactionManager;

/**
 * Created by shali_000 on 11/25/2014.
 */
@Repository
public class Dao {


    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(SessionFactory sessionFactory) {
        hibernateTemplate.setSessionFactory(sessionFactory);
    }
}

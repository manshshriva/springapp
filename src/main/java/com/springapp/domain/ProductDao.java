package com.springapp.domain;

import org.hibernate.SessionFactory;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shali_000 on 11/24/2014.
 */

@Repository
public class ProductDao extends Dao {

    @Transactional
    public  List<Product>  getProducts() {
        List<Product> products = getHibernateTemplate().loadAll(Product.class);
        return products;
    }

}

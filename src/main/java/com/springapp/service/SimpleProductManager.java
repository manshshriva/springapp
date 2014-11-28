package com.springapp.service;

import com.springapp.domain.Product;
import com.springapp.domain.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shali_000 on 11/24/2014.
 */
@Service
public class SimpleProductManager implements ProductManager {

    @Autowired(required = true)
    private ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }



    @Override
    public void increasePrice(int percentage) {
        List<Product> products= productDao.getProducts();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }
}

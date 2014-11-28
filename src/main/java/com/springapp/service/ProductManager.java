package com.springapp.service;

import com.springapp.domain.Product;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shali_000 on 11/24/2014.
 */

public interface ProductManager extends Serializable {
    public void increasePrice(int percentage);
    public List<Product> getProducts();

}

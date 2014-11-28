package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shali_000 on 11/24/2014.
 */

@Entity
@Table(name = "products",schema = "app")
public class Product implements Serializable {
    @Id
    private Integer id;
    private String description;
    private Double price;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
    }
}

package com.springapp.mvc;

import com.springapp.domain.Product;
import com.springapp.service.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by shali_000 on 11/24/2014.
 */
@Controller
@RequestMapping("/product")
public class InventoryController {

    @Autowired
    private ProductManager productManager;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showProductInventory(HttpServletRequest request, HttpServletResponse response , ModelAndView modelAndView){
        List<Product> products=productManager.getProducts();
        modelAndView.addObject("products",products);
        modelAndView.setViewName("inventory");
        return modelAndView;
    }

    public ProductManager getProductManager() {
        return productManager;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

}

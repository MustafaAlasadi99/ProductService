package edu.csumb.cst438.ProductService.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.ProductService.api.entities.Product;
import edu.csumb.cst438.ProductService.data.ProductDbClient;

@Service
public class Manager {
    @Autowired
    ProductDbClient productDbClient;


    public List<Product> findAllProducts () {


        return productDbClient.GetAllProducts();
    }



    public Product findProductByid (String id) {


        return productDbClient.GetProductById(id);
    }

}
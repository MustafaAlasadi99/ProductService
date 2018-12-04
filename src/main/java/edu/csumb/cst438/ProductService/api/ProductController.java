package edu.csumb.cst438.ProductService.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.csumb.cst438.ProductService.api.entities.Product;
import edu.csumb.cst438.ProductService.api.entities.Price;
import edu.csumb.cst438.ProductService.api.entities.Name;
import edu.csumb.cst438.ProductService.api.entities.Items_in_stock;
import edu.csumb.cst438.ProductService.api.entities.Image;
import edu.csumb.cst438.ProductService.api.entities.Description;


import edu.csumb.cst438.ProductService.business.Manager;

@RestController
public class ProductController {
    @Autowired
    Manager manager;


    @CrossOrigin(origins = "https://team-7-project.herokuapp.com")
    @GetMapping ("/getProducts")
    @ResponseBody
    List<Product> getAllProducts () {


        return manager.findAllProducts();
    }



    
    @CrossOrigin(origins = "https://team-6-project.herokuapp.com")
    @GetMapping ("/id/{id}" )
    @ResponseBody
    Product getProductById (@PathVariable String id) {


        return manager.findProductByid(id);
    }





   

}
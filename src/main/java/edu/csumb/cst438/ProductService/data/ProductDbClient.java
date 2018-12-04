package edu.csumb.cst438.ProductService.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.csumb.cst438.ProductService.api.entities.Product;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Repository
public class ProductDbClient {
    
    public List<Product> GetAllProducts () {
   
           String uri = "https://products-db1.herokuapp.com/GetAllProducts";
            RestTemplate restTemplate = new RestTemplate();
           ResponseEntity<List<Product>> result = restTemplate.exchange(uri,
           HttpMethod.GET,null, 
           new ParameterizedTypeReference<List<Product>>(){});
           return result.getBody();  
        
    }

    public Product GetProductById (String id) {

        String uri = "https://products-db1.herokuapp.com/id/" + id;
             RestTemplate restTemplate = new RestTemplate();
             ResponseEntity<Product> result = restTemplate.exchange(uri,
             HttpMethod.GET,null, 
             new ParameterizedTypeReference<Product>(){});
             return result.getBody();



    }
}
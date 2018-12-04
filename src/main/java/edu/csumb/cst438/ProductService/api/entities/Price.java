package edu.csumb.cst438.ProductService.api.entities;

public class Price {
    private Double price;


    public Price () {
        super();
    }


    public Price (Double price) {

        super();
        this.price = price;
    }

 

    public Double getPrice () {
        return this.price;
    }

  

 public void setPrice (Double price) {

        this.price=price;
    }





}

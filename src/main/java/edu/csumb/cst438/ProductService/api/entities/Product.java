package edu.csumb.cst438.ProductService.api.entities;


public class Product {
    
    private String id;
    private Name name; 
    private Price price;
    private Items_in_stock items_in_stock;
    private Description description;
    private Image image;


    public Product(){
        super();
    }



    public Product (Name name, Price price, Items_in_stock items_in_stock, Description description, Image image ) {
        

        super();

        this.name=name;

        this.price=price;

        this.items_in_stock=items_in_stock;

        this.description=description;

        this.image=image;
        
    }

    public String getId () {
        return this.id;
    }


    public void setId (String id) {
         this.id=id ;
    }



  

    public Name getName (){

        return this.name;
    }

    public void setName (Name name){

        this.name=name;
    }




    public Price getPrice (){

        return this.price;
    }


    public void setPrice (Price price){

         this.price=price;
    }



    public Items_in_stock getItems_in_stock (){

        return this.items_in_stock;
    }

    public void setItems_in_stock (Items_in_stock items_in_stock ){

         this.items_in_stock=items_in_stock;
    }

 

    public Description getDescription (){

        return this.description;
    }

    public void setDescription (Description description ){

         this.description=description ;
    }



    public Image getImage (){

        return this.image;
    }

    public void setImage (Image image){

        this.image=image;
    }










  
 
}
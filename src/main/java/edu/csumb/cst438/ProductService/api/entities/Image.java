
package edu.csumb.cst438.ProductService.api.entities;

public class Image {
    private String imgurl;

    public Image () {
        super();
    }


    public Image (String imgurl) {
        super();
        this.imgurl = imgurl;
    }

 

    public String getImgurl () {
        return this.imgurl;
    }


    public void setImgurl (String imgurl ) {
         this.imgurl=imgurl;
    }

  






}

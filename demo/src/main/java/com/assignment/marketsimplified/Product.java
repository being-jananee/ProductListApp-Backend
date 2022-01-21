package com.assignment.marketsimplified;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue()
    private Integer productId;
    
    @Column(nullable = false,name = "GENDER")
    private String Gender;
    
    @Column(nullable = false,name = "CATEGORY")
    private String Category;
    
    @Column(nullable = false,name = "SUB_CATEGORY")
    private String SubCategory;
    
    @Column(nullable = false,name = "PRODUCT_TYPE")
    private String ProductType;
    
    @Column(nullable = false,name ="COLOUR")
    private String Colour;
    
    @Column(nullable = false,name ="USE")
    private String Use;
    
    @Column(nullable = false,name ="PRODUCT_TITLE"  )
    private String ProductTitle;
    
    
    @Column(nullable = false,name ="IMAGEURL" )
    private String ImageURL;
}

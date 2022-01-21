package com.assignment.marketsimplified.Controller;

import com.assignment.marketsimplified.Product;
import com.assignment.marketsimplified.Repository.ProductRepo;
import com.assignment.marketsimplified.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> result = new ArrayList<>();
        productService.getAllProducts().forEach(result::add);
        return result;
    }
}

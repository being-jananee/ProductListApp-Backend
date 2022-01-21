package com.assignment.marketsimplified.Service;

import com.assignment.marketsimplified.Product;
import com.assignment.marketsimplified.Repository.ProductRepo;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;

    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

}

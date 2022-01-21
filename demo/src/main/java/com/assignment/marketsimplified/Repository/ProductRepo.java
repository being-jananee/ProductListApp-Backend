package com.assignment.marketsimplified.Repository;

import com.assignment.marketsimplified.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {

}

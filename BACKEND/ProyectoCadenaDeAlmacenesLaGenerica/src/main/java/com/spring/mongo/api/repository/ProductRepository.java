package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long> {

}

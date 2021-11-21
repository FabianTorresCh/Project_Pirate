package com.spring.mongo.api.repository;

// IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
// IMPORT MODEL
import com.spring.mongo.api.model.model_customer;

// BODY REPOSITORY
public interface repository_customer extends MongoRepository <model_customer, Integer>{
}

package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//BODY REPOSITORY
import com.spring.mongo.api.model.model_product;

//BODY REPOSITORY
public interface repository_product extends MongoRepository<model_product, Long> {

}

package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//IMPORT MODEL
import com.spring.mongo.api.model.model_store;

//BODY REPOSITORY
public interface repository_store extends MongoRepository <model_store,Integer>{

}

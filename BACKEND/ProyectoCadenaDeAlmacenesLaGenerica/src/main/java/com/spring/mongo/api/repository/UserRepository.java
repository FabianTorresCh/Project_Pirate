package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//IMPORT MODEL
import com.spring.mongo.api.model.model_user;

//BODY REPOSITORY
public interface UserRepository extends MongoRepository<model_user, Long> {

}

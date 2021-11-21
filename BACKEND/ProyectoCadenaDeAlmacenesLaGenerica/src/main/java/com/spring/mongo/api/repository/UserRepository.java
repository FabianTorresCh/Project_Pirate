package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//IMPORT MODEL
import com.spring.mongo.api.model.User;

//BODY REPOSITORY
public interface UserRepository extends MongoRepository<User, Long> {

}

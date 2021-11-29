package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//IMPORT MODEL
import com.spring.mongo.api.model.model_sale_detail;

//BODY REPOSITORY
public interface repository_sale_detail extends MongoRepository <model_sale_detail, Long>{

}

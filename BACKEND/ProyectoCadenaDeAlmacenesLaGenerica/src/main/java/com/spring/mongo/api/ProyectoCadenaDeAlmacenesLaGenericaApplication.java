package com.spring.mongo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoCadenaDeAlmacenesLaGenericaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCadenaDeAlmacenesLaGenericaApplication.class, args);
	}

}

/* CONECTION LOCAL DATABASE
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=bd_cadena_almacenes_tienda_la_generica
*/

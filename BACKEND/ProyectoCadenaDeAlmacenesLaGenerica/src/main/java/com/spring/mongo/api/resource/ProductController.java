package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Product;
import com.spring.mongo.api.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Producto agregado satisfactoriamente N. " + product.getCodigo_producto();
	}

	// LSIT PRODUCTOS
	@GetMapping("/findAllproducts")
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@GetMapping("/findAllproducts/{codigo_producto}")
	public Optional<Product> getBooks(@PathVariable long codigo_producto) {
		return repository.findById(codigo_producto);
	}

	@DeleteMapping("/delete/{codigo_producto}")
	public String deleteBook(@PathVariable long codigo_producto) {
		return "Libro eliminado con exito " + codigo_producto;
	}

}

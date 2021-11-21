package com.spring.mongo.api.resource;

//IMPORT ELEMENT
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//IMPORT MODEL
import com.spring.mongo.api.model.model_product;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_product;

//BODY CONTROLLER
@RestController
public class controller_product {

	// OBJECT REPOSITORY PRODUCT
	@Autowired
	private repository_product repository;

	// ADD PRODUCT
	@PostMapping("/add_product")
	public String saveProduct(@RequestBody model_product product) {
		repository.save(product);
		return "ADD PRODUCT: "
				+ "\nPRODUCT ID: 				["+product.getId()+"]"
				+ "\nPRODUCT FULL NAME: 			["+product.getNombre_producto()+"]"
				+ "\nPRODUCT NUMBER SUPPLIER: 	["+product.getNit_proveedor()+"]"
				+ "\nPRODUCT PRICE TO BUY: 		["+product.getPrecio_compra()+"]"
				+ "\nPRODUCT IVA TO BUY: 		["+product.getIva_compra()+"]"
				+ "\nPRODUCT PRICE SELL: 		["+product.getPrecio_venta()+"]";
	}

	// GET LIST PRODUCT
	@GetMapping("/get_list_product")
	public List<model_product> getProducts() {
		return repository.findAll();
	}

	// GET PRODUCT BY ID
	@GetMapping("/get_product_byid/{codigo_producto}")
	public Optional<model_product> getBooks(@PathVariable long codigo_producto) {
		return repository.findById(codigo_producto);
	}

	// DELETE PRODUCTOS BY ID
	@DeleteMapping("/delete_product_byid/{codigo_producto}")
	public String deleteBook(@PathVariable long codigo_producto) {
		repository.deleteById(codigo_producto);
		return "DELETE PRODUCT " + codigo_producto;
	}

}

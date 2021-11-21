package com.spring.mongo.api.resource;

// IMPORT ELEMENT
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// IMPORT MODEL
import com.spring.mongo.api.model.model_customer;
// IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_customer;

// BODY CONTROLLER
@RestController
public class controller_customer {
	
	// OBJECT REPOSITORY CUSTOMER
	@Autowired
	private repository_customer obj_repository_customer;
	
	// ADD CUSTOMER
	@PostMapping("/add_customer")
	public String action_add_customer (@RequestBody model_customer obj_model_customer) {
		obj_repository_customer.save(obj_model_customer);
		return "ADD CUSTOMER: "
				+ "\nCUSTOMER ID: 			["+obj_model_customer.getId()+"]"
				+ "\nCUSTOMER FULL NAME: 	["+obj_model_customer.getCustomer_namefull()+"]"
				+ "\nCUSTOMER ADDRESS: 		["+obj_model_customer.getCustomer_address()+"]"
				+ "\nCUSTOMER PHONE: 		["+obj_model_customer.getCustomer_phone()+"]"
				+ "\nCUSTOMER EMAIL: 		["+obj_model_customer.getCustomer_email()+"]";
	}
	
	// GET LIST CUSTOMER
	@GetMapping("/get_list_customer")
	public List<model_customer> action_get_list_customer() {
		System.out.println("LIST CUSTOMER: "+obj_repository_customer.findAll().toString());
		return obj_repository_customer.findAll();
	}
	
	// GET CUSTOMER BY ID
	@GetMapping("/get_customer_byid/{customerbyid}")
	public Optional<model_customer> action_get_customer_byid (@PathVariable int customerbyid) {
		System.out.println("\n>> >> CUSTOMER ID: "+ customerbyid);	
		return obj_repository_customer.findById(customerbyid);
	}

	// DELETE CUSTOMER BY ID
	@DeleteMapping("/delete_customer_byid/{customerbyid}")
	public String action_delete_customer_byid (@PathVariable int customerbyid) {
		obj_repository_customer.deleteById(customerbyid);
		return "DELETE CUSTOMER BY ID: ["+customerbyid+"]";
	}
	
	
}

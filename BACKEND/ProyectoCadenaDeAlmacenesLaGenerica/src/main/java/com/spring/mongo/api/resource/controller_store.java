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
import com.spring.mongo.api.model.model_store;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_store;

//BODY CONTROLLER
@RestController
public class controller_store {

	// OBJECT REPOSITORY STORE
	@Autowired
	private repository_store obj_repository_store;
	
	// ADD STORE
	@PostMapping("/add_store")
	public String action_add_store (@RequestBody model_store obj_model_store) {
		obj_repository_store.save(obj_model_store);
		return "ADD STORE >> "
			+ "\nSTORE ID:				["+obj_model_store.getId()+"]"
			+ "\nSTORE FULL NAME:		["+obj_model_store.getStore_namefull()+"]"
			+ "\nSTORE CITY:				["+obj_model_store.getStore_city()+"]"
			+ "\nSTORE ADDRESS:			["+obj_model_store.getStore_address()+"]"
			+ "\nSTORE EMAIL:			["+obj_model_store.getStore_email()+"]"
			+ "\nSTORE PHONE:			["+obj_model_store.getStore_phone()+"]";
	}
	
	// GET LIST STORE
	@GetMapping("/get_list_store")
	public List<model_store> action_get_list_store() {
		return obj_repository_store.findAll();
	}
	
	// GET STORE BY ID
	@GetMapping("/get_store_by_id/{store_byid}")
	public Optional<model_store> action_get_store_byid (@PathVariable int store_byid) {
		System.out.println("\n>> >> STORE ID: "+ store_byid);	
		return obj_repository_store.findById(store_byid);
	}

	// DELETE STORE BY ID
	@DeleteMapping("/delete_store_by_id/{store_byid}")
	public String action_delete_store_byid (@PathVariable int store_byid) {
		obj_repository_store.deleteById(store_byid);
		return "DELETE STORE BY ID: ["+store_byid+"]";
	}
	
}

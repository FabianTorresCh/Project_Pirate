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
import com.spring.mongo.api.model.model_supplier;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_supplier;

//BODY CONTROLLER
@RestController
public class controller_supplier {

	// OBJECT REPOSITORY SUPPLIER
	@Autowired
	private repository_supplier obj_repository_supplier;
	
	// ADD SUPPLIER
	@PostMapping("/add_supplier")
	public String action_add_suppliar (@RequestBody model_supplier obj_model_supplier) {
		obj_repository_supplier.save(obj_model_supplier);
		return "ADD SUPPLIER: "
			+ "\nSUPPLIER NIT: 				["+obj_model_supplier.getId()+"]"
			+ "\nSUPPLIER NIT DIGIT: 		["+obj_model_supplier.getSupplier_nit_digit()+"]"
			+ "\nSUPPLIER FULL NAME: 		["+obj_model_supplier.getSupplier_namefull()+"]"
			+ "\nSUPPLIER ADDRESS: 			["+obj_model_supplier.getSupplier_address()+"]"
			+ "\nSUPPLIER EMAIL: 			["+obj_model_supplier.getSupplier_email()+"]"
			+ "\nSUPPLIER PHONE: 			["+obj_model_supplier.getSupplier_phone()+"]"
			+ "\nSUPPLIER TYPE: 				["+obj_model_supplier.getSupplier_type()+"]";
	}
		
	// GET LIST SUPPLIER
	@GetMapping("/get_list_supplier")
	public List<model_supplier> action_get_list_supplier () {
		return obj_repository_supplier.findAll();
	}
		
	// GET SUPPLIER BY ID
	@GetMapping("/get_supplier_byid/{supplierbyid}")
	public Optional<model_supplier> action_get_suppliar_byid (@PathVariable long suppliarbyid) {
		System.out.println("\n>> >> CUSTOMER ID: "+ suppliarbyid);	
		return obj_repository_supplier.findById(suppliarbyid);
	}
	
	// DELETE SUPPLIER BY ID
	@DeleteMapping("/delete_supplier_byid/{supplierbyid}")
	public String action_delete_suppliar_byid (@PathVariable long suppliarbyid) {
		obj_repository_supplier.deleteById(suppliarbyid);
		return "DELETE SUPPLIER BY ID: ["+suppliarbyid+"]";
	}
	
}

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
import com.spring.mongo.api.model.model_sale_detail;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_sale_detail;

//BODY CONTROLLER
@RestController
public class controller_sale_detail {
	
	// OBJECT REPOSITORY SALE DETAIL
	@Autowired
	private repository_sale_detail obj_repository_sale_detail;
	
	// ADD SALE DETAIL
	@PostMapping("/add_sale_detail")
	public String action_add_sale_detail (@RequestBody model_sale_detail obj_model_sale_detail) {
		obj_repository_sale_detail.save(obj_model_sale_detail);
		return "ADD SALE DETAIL: "
			+ "\nSALE DETAIL INVOICE ID:			["+obj_model_sale_detail.getId()+"]" // OPERATION NUMBER (ID)
			+ "\nSALE DETAIL DATE:					["+obj_model_sale_detail.getSale_date()+"]"
			+ "\nSALE DETAIL STORE ID:				["+obj_model_sale_detail.getSale_store_id()+"]"
			+ "\nSALE DETAIL USER ID:				["+obj_model_sale_detail.getSale_user_id()+"]"
			+ "\nSALE DETAIL CUSTOMER ID:		["+obj_model_sale_detail.getSale_customer_id()+"]"
			+ "\nSALE DETAIL OPERATION:			["+obj_model_sale_detail.getList_sale_operation()+"]"
			+ "\nSALE DETAIL TOTAL:					["+obj_model_sale_detail.getSale_total()+"]";
	}
	
	// GET LIST SALE DETAIL
	@GetMapping("/get_list_sale_detail")
	public List <model_sale_detail> action_get_list_sale_detail() {
		return obj_repository_sale_detail.findAll();
	}
	
	// GET SALE DETAIL BY OPERATION NUMBER (ID)
	@GetMapping("/get_sale_detail_by_operation_number/{s_d_by_operation_number}")
	public Optional<model_sale_detail> action_get_sale_detail_by_operation_number (@PathVariable long s_d_by_operation_number) {
		System.out.println("\n>> >> SALE DETAIL OPERATION NUMBER (ID): "+ s_d_by_operation_number);	
		return obj_repository_sale_detail.findById(s_d_by_operation_number);
	}

	// DELETE SALE DETAIL BY OPERATION NUMBER (ID)
	@DeleteMapping("/delete_sale_detail_by_operation_number/{s_d_by_operation_number}")
	public String action_delete_sale_detail_by_operation_number (@PathVariable long s_d_by_operation_number) {
		obj_repository_sale_detail.deleteById(s_d_by_operation_number);
		return "DELETE SALE DETAIL BY ID: ["+s_d_by_operation_number+"]";
	}

	
}

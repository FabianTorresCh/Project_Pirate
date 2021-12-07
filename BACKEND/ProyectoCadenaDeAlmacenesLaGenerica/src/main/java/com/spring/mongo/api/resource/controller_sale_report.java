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
import com.spring.mongo.api.model.model_sale_report;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_sale_report;

//BODY CONTROLLER
@RestController
public class controller_sale_report {

	// OBJECT REPOSITORY SALE REPORT
	@Autowired
	private repository_sale_report obj_repository_sale_report;
	
	// ADD SALE REPORT
	@PostMapping("/add_sale_report")
	public String action_add_sale_report (@RequestBody model_sale_report obj_model_sale_report) {
		obj_repository_sale_report.save(obj_model_sale_report);
		return "ADD SALE REPORT >> "
			+ "\nSALE REPORT ID:						["+obj_model_sale_report.getId()+"]"
			+ "\nSALE REPORT DATE:					["+obj_model_sale_report.getS_report_sale_date()+"]"
			+ "\nSALE REPORT STORE ID:			["+obj_model_sale_report.getS_report_store_id()+"]"
			+ "\nSALE REPORT USER ID:				["+obj_model_sale_report.getS_report_user_id()+"]"
			+ "\nSALE REPORT CUSTOMER ID:		["+obj_model_sale_report.getS_report_customer_id()+"]"
			+ "\nSALE REPORT SALE TOTAL:		["+obj_model_sale_report.getS_report_sale_total()+"]";
	}
	
	// GET LIST SALE REPORT
	@GetMapping("/get_list_sale_report")
	public List<model_sale_report> action_get_list_sale_report() {
		return obj_repository_sale_report.findAll();
	}
	
	// GET SALE REPORT BY INVOICE ID
	@GetMapping("/get_sale_report_by_invoice_id/{sale_report_by_invoice_id}")
	public Optional<model_sale_report> action_get_sale_report_by_invoice_id (@PathVariable long sale_report_by_invoice_id) {
		System.out.println("\n>> >>SALE REPORT BY INVOICE ID: "+ sale_report_by_invoice_id);	
		return obj_repository_sale_report.findById(sale_report_by_invoice_id);
	}

	// DELETE SALE REPORT BY INVOICE ID
	@DeleteMapping("/delete_sale_report_by_invoice_id/{sale_report_by_invoice_id}")
	public String action_delete_sale_report_by_invoice_id (@PathVariable long sale_report_by_invoice_id) {
		obj_repository_sale_report.deleteById(sale_report_by_invoice_id);
		return "DELETE SALE REPORT BY INVOICE ID: ["+sale_report_by_invoice_id+"]";
	}
	
	
}

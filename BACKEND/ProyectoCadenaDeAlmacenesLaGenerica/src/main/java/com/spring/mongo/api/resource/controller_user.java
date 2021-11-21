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
import com.spring.mongo.api.model.model_user;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.repository_user;

//BODY CONTROLLER
@RestController
public class controller_user {

	// OBJECT REPOSITORY USER
	@Autowired
	private repository_user repository;

	// ADD USER
	@PostMapping("/add_user")
	public String registerUser(@RequestBody model_user user) {
		repository.save(user);
		return "ADD USER: "
		+ "\nUSER ID: 			["+user.getId()+"]"
		+ "\nUSER FULL NAME: 	["+user.getNombre_usuario()+"]"
		+ "\nUSER EMAIL: 		["+user.getEmail_usuario()+"]"
		+ "\nUSER TYPE: 			["+user.getUsuario()+"]"
		+ "\nUSER PASSWORD: 		["+user.getPassword()+"]";
	}

	// GET LIST CUSTOMER
	@GetMapping("/get_list_user")
	public List<model_user> getUSers() {
		return repository.findAll();
	}

	// GET CUSTOMER BY ID 
	@GetMapping("/get_user_byid/{id}")
	public Optional<model_user> getUSersById(@PathVariable long id) {
		System.out.println("\n>> >> USER ID: "+ id);		
		return repository.findById(id);
	}

	@DeleteMapping("/delete_user_byid/{id}")
	public String deleteUser(@PathVariable long id) {
		repository.deleteById(id);
		return "DELETE USER: " + id;
	}

}

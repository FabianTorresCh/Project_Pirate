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
import com.spring.mongo.api.model.User;
//IMPORT REPOSITORY
import com.spring.mongo.api.repository.UserRepository;

//BODY CONTROLLER
@RestController
public class UserController {

	// OBJECT REPOSITORY USER
	@Autowired
	private UserRepository repository;

	// ADD USER
	@PostMapping("/addUSer")
	public String registerUser(@RequestBody User user) {
		repository.save(user);
		
		return "ADD USER: "
		+ "\nUSER ID: 			["+user.getCedula_usuario()+"]"
		+ "\nUSER FULL NAME: 	["+user.getNombre_usuario()+"]"
		+ "\nUSER EMAIL: 		["+user.getEmail_usuario()+"]"
		+ "\nUSER TYPE: 			["+user.getUsuario()+"]"
		+ "\nUSER PASSWORD: 		["+user.getPassword()+"]";
	}

	// GET LIST CUSTOMER
	@GetMapping("/findAllUsers")
	public List<User> getUSers() {
		return repository.findAll();
	}

	// GET CUSTOMER BY ID 
	@GetMapping("/findAllUsers/{cedula_usuario}")
	public Optional<User> getUSersById(@PathVariable long cedula_usuario) {
		System.out.println("\n>> >> cedula_usuario: "+cedula_usuario);
		return repository.findById(cedula_usuario);
	}

	@DeleteMapping("/delete/{cedula_usuario}")
	public String deleteUser(long cedula_usuario) {
		repository.deleteById(cedula_usuario);
		return "Usuario eliminado satisfactoriamente " + cedula_usuario;
	}

}

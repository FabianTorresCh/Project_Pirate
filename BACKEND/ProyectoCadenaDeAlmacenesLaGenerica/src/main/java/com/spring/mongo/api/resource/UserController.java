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

import com.spring.mongo.api.model.User;
import com.spring.mongo.api.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@PostMapping("/addUSer")
	public String registerUser(@RequestBody User user) {
		repository.save(user);
		return "Usuario registrado satisfactoriamente N." + user.getCedula_usuario();
	}

	@GetMapping("/findAllUsers")
	public List<User> getUSers() {
		return repository.findAll();
	}

	@GetMapping("/findAllUsers/{cedula_usuario}")
	public Optional<User> getUSers(@PathVariable long cedula_usuario) {
		return repository.findById(cedula_usuario);
	}

	@DeleteMapping("/delete/{cedula_usuario}")
	public String deleteUser(long cedula_usuario) {
		repository.deleteById(cedula_usuario);
		return "Usuario eliminado satisfactoriamente " + cedula_usuario;
	}

}

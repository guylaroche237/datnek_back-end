package com.guy.datnek.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guy.datnek.entite.User;
import com.guy.datnek.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/save")
	public ResponseEntity<?> createUser(@RequestBody User user){
		
	
		
		User usr = userRepository.save(user);
		if(usr != null) {
			return ResponseEntity.ok(usr);
		}else {
			return ResponseEntity.badRequest().body("Creation echouer");
		}
	}
	
	
	@GetMapping("/alls")
	public ResponseEntity<?> getAllUsers(){
		List<User> users = userRepository.findAll();
		return ResponseEntity.ok(users);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable(value = "id") long id){
		userRepository.deleteById(id);
			
	}
	
	@GetMapping("/existe/{langue}")
	public boolean checkExisteByLangue(@PathVariable(value = "langue") String langue) {
		return userRepository.existsByLangue(langue);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		
		User usr = userRepository.save(user);
		if(usr != null) {
			return ResponseEntity.ok(usr);
		}else {
			return ResponseEntity.badRequest().body("User Introuvable");
		}
	}

}

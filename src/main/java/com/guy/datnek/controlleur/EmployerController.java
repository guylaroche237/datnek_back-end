package com.guy.datnek.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guy.datnek.entite.Employe;
import com.guy.datnek.entite.User;
import com.guy.datnek.repository.EmployerRepository;

@RestController
@RequestMapping("/api/employe")
public class EmployerController {
	
	@Autowired
	EmployerRepository employerRepository;
	
	@PostMapping("/save")
	public ResponseEntity<?> createEmploye(@RequestBody Employe employe){
	
		Employe usr = employerRepository.save(employe);
		if(usr != null) {
			return ResponseEntity.ok(usr);
		}else {
			return ResponseEntity.badRequest().body("Creation echouer");
		}
	}
	
	
	@GetMapping("/alls")
	public ResponseEntity<?> getAllEmployer(){
		List<Employe> users = employerRepository.findAll();
		return ResponseEntity.ok(users);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmploye(@PathVariable(value = "id") long id){
		employerRepository.deleteById(id);
			
	}

}

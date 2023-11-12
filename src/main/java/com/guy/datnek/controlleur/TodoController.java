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

import com.guy.datnek.entite.Todo;
import com.guy.datnek.entite.User;
import com.guy.datnek.repository.TodoRepository;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;
	
	@PostMapping("/save")
	public ResponseEntity<?> createTodo(@RequestBody Todo todo){	
		Todo td = todoRepository.save(todo);
		if(td != null) {
			return ResponseEntity.ok(td);
		}else {
			return ResponseEntity.badRequest().body("Creation echouer");
		}
	}
	
	@GetMapping("/alls")
	public ResponseEntity<?> getAllTodo(){
		List<Todo> todos = todoRepository.findAll();
		return ResponseEntity.ok(todos);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteTodo(@PathVariable(value = "id") long id){
		todoRepository.deleteById(id);
			
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateTodo(@RequestBody Todo todo){
		
		Todo Tdo = todoRepository.save(todo);
		if(Tdo != null) {
			return ResponseEntity.ok(Tdo);
		}else {
			return ResponseEntity.badRequest().body("User Introuvable");
		}
	}

}

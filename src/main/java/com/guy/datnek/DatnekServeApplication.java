package com.guy.datnek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guy.datnek.entite.Employe;
import com.guy.datnek.entite.Todo;
import com.guy.datnek.repository.EmployerRepository;
import com.guy.datnek.repository.TodoRepository;



@SpringBootApplication
public class DatnekServeApplication implements CommandLineRunner {
	
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatnekServeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Todo todo = new Todo(0,"Administrateur",false);
		Todo todo1 = new Todo(0,"DevObs",true);
		todoRepository.save(todo);
		todoRepository.save(todo1);
		
	}

}

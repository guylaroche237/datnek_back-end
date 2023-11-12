package com.guy.datnek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guy.datnek.entite.Employe;

public interface EmployerRepository extends JpaRepository<Employe, Long>{

}

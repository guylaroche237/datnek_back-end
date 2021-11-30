package com.guy.datnek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guy.datnek.entite.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

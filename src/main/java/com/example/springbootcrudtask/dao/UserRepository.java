package com.example.springbootcrudtask.dao;

import com.example.springbootcrudtask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

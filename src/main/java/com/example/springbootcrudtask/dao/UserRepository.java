package com.example.springbootcrudtask.dao;

import com.example.springbootcrudtask.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

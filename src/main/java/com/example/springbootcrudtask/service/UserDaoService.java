package com.example.springbootcrudtask.service;


import com.example.springbootcrudtask.model.User;
import java.util.List;

public interface UserDaoService {
    public void addUser(User user);
    public void deleteUser(Long id);
    public void updateUser(User user);
    public List<User> findAll();
    public User getById(Long id);

}

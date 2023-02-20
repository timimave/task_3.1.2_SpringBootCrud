package com.example.springbootcrudtask.service;

import com.example.springbootcrudtask.dao.UserRepository;
import com.example.springbootcrudtask.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserDaoServiceImpl implements UserDaoService {
private final UserRepository userRepository;

    public UserDaoServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }
}

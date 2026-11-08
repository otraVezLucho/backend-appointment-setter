package com.psicologiaweb.gestor_de_citas.service;

import com.psicologiaweb.gestor_de_citas.model.User;
import com.psicologiaweb.gestor_de_citas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceJPA implements UserService{


    private final UserRepository userRepository;

    @Autowired
    public UserServiceJPA(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }
}

package com.psicologiaweb.gestor_de_citas.service;

import com.psicologiaweb.gestor_de_citas.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void deleteById( Long id);
    User save(User user);
    User updateUser(Long id,User user);

}

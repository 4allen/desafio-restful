package me.hellen.desafio.service;

import me.hellen.desafio.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}

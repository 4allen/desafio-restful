package me.hellen.desafio.service.impl;

import me.hellen.desafio.domain.model.User;
import me.hellen.desafio.domain.repository.UserRepository;
import me.hellen.desafio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("Esse usuário já existe.");
        }
        return userRepository.save(userToCreate);
    }
}

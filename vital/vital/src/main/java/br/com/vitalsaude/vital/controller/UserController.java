package br.com.vitalsaude.vital.controller;

import br.com.vitalsaude.vital.repository.UserRepository;
import br.com.vitalsaude.vital.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public void addUsers(@RequestBody final List<User> users) {

        userRepository.saveAll(users);

    }

    @GetMapping("/users")
    public List<User> findUsers() {

        return userRepository.findAll();

    }

    @GetMapping("/user/{userId}")
    public User findUser( @PathVariable final String userId) {

        return userRepository.findById(userId).orElseGet(User::new);
    }
}

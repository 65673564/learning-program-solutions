package com.example.springdatajpa.runner;

import com.example.springdatajpa.model.User;
import com.example.springdatajpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("Raji"));
        userRepository.save(new User("Hari"));
        userRepository.findAll().forEach(user -> System.out.println(user.getName()));
    }
}

package com.spring.demo.service;

import com.spring.demo.entity.User;
import com.spring.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @created: 04/01/2024 - 7:55 PM
 * @author: dungna
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        List<User> result = userRepository.findAll();
        return result;
    }

    public void deleteUser(String id) {
        userRepository.deleteById(Long.parseLong(id));
    }

    public Long addUser(User user) {
        User item = userRepository.save(user);
        return item.getId();
    }

    public User getUserById(String id) {
        Optional<User> item = userRepository.findById(Long.parseLong(id));
        User result = item.get();
        return result;
    }

}

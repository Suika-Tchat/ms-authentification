package com.suikatchat.auth.service;

import com.suikatchat.auth.dao.document.User;
import com.suikatchat.auth.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        User saveUser = userRepository.save(user);

    }

}

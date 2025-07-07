package com.in.supplementStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.supplementStore.Entities.User;
import com.in.supplementStore.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User registerUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }
    public User updateUser(User user) {
        return userRepo.save(user);
    }
}
package com.epam.service;

import com.epam.model.User;
import com.epam.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
 public    Optional<User> getUser(String login){
        return userRepo.findOneByLogin(login);
    }

}

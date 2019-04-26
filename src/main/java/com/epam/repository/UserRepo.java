package com.epam.repository;

import com.epam.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Long> {
    Optional<User> findOneByLogin(String login);
}

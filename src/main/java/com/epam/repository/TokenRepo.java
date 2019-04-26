package com.epam.repository;

import com.epam.model.Token;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TokenRepo extends CrudRepository<Token,Long>{
    Optional<Token> findOneByValue(String value);
}

package com.epam.service;

import com.epam.dto.TokenDto;
import com.epam.forms.LoginForm;
import com.epam.model.Token;
import com.epam.model.User;
import com.epam.repository.TokenRepo;
import com.epam.repository.UserRepo;
import jdk.nashorn.internal.ir.Optimistic;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;
@Component
public class LoginService {

    
    
    @Autowired
    private TokenRepo tokenRepo;

   @Autowired
   PasswordEncoder passwordEncoder;
    
    @Autowired
    UserRepo userRepo;
    
  public   String login(LoginForm loginForm) {
        Optional<User> userOptional = userRepo.findOneByLogin(loginForm.getLogin());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Token token=new Token();
            if ((passwordEncoder.matches(loginForm.getPassword(), user.getPassword()))) {
                token.setUser(user);
                token.setValue(RandomStringUtils.random(10,true,true));
                System.out.println(token.getValue());
                tokenRepo.save(token);
                return TokenDto.from(token).toString();
            }
        }
        throw new IllegalArgumentException("User not found.");
    }
}

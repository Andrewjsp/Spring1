package com.epam.details;

import com.epam.model.User;
import com.epam.repository.UserRepo;
import com.epam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@ComponentScan("com.epam")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Optional<User>user= userService.getUser(s);

        if (user.isPresent()){
            return new UserDetailsImpl(user.get());
        }
        else {
            throw new IllegalArgumentException("User not found");
        }
    }
}

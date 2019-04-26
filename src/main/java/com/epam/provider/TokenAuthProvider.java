package com.epam.provider;

import com.epam.model.Token;
import com.epam.repository.TokenRepo;
import com.epam.securityToken.TokenAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class TokenAuthProvider implements AuthenticationProvider {
    @Autowired
    private TokenAuthProvider tokenAuthProvider;
    @Autowired
    private TokenRepo tokenRepo;
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        TokenAuth tokenAuth = (TokenAuth) authentication;
        Optional<Token> tokenCandidate = tokenRepo.findOneByValue(tokenAuth.getName());
        if (tokenCandidate.isPresent()) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(tokenCandidate.get().getUser().getLogin());
            tokenAuth.setUserDetails(userDetails);
            tokenAuth.setAuthenticated(true);
            return tokenAuth;
        } else {
            throw new IllegalArgumentException("Not found Token");
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return TokenAuth.class.equals(aClass);
    }
}

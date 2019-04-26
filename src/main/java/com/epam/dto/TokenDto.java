package com.epam.dto;

import com.epam.model.Token;

public class TokenDto {
private String value;


TokenDto(String value1){
        value=value1;
}

public static TokenDto from(Token token){
    return new TokenDto(token.getValue());
}
    
    @Override
    public String toString() {
        return "TokenDto{" +
                "value='" + value + '\'' +
                '}';
    }
}

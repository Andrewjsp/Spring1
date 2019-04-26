package com.epam.dto;

import com.epam.model.User;

public class UserDto {
private String login;
    private String name;
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
public static UserDto from(User user){
    UserDto userDto=new UserDto();
    userDto.setLogin(user.getLogin());
    userDto.setName(user.getUserName());
    return userDto;
}
}

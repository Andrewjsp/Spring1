package com.epam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String login;
    private String password;
@Enumerated(value = EnumType.STRING)
    private Role role;
@Enumerated(value = EnumType.STRING)
private State state;
    
    @OneToMany(mappedBy = "users")
    List<Token> tokens;
    
    public List<Token> getList() {
        return tokens;
    }
    
    public void setList(List<Token> list) {
        this.tokens = list;
    }
    
    public long getId() {
        return id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
}

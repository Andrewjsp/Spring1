package com.epam.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component
@Entity
@Table(name="token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String value;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public User getUser() {
        return users;
    }
    
    public void setUser(User user) {
        this.users = user;
    }
}

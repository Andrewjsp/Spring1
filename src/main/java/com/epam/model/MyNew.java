package com.epam.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "my_news")
public class MyNew {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String title;
private String content;
private Date date;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}

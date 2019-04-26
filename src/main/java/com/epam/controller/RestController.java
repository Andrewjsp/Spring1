package com.epam.controller;

import com.epam.model.MyNew;
import com.epam.model.Qwe;
import com.epam.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = {"/api"},produces = "application/json")
public class RestController {
    
    @Autowired
    NewsService newsService;
    
    @PostMapping("/q")
    ResponseEntity add(@RequestBody Qwe qwe) {
        System.out.println(new Date());
        if (qwe == null) {
           return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        System.out.println(qwe.getAge());
        System.out.println(qwe.getName());
        return new ResponseEntity(HttpStatus.OK);
    }
}

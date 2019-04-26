package com.epam.controller;

import com.epam.model.MyNew;
import com.epam.repository.NewsRepo;
import com.epam.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api"},produces = "application/json")
public class NewsController {
    
    @Autowired
    NewsRepo newsRepo;

    @GetMapping("/all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(newsRepo.findAllBy());
    }


    @PostMapping("/add")
    public ResponseEntity getAll(@RequestBody MyNew myNew){
        newsRepo.save(myNew);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}

package com.example.todo.controller;


import com.example.todo.entity.Todo;
import com.example.todo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private Repo todorepo;

    @GetMapping("/")
    public List<Todo> root(){
        return this.todorepo.findAll();
    }

}


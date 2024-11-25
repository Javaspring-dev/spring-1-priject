package com.example.todo.repository;

import com.example.todo.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Todo, Long> {

}

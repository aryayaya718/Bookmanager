package com.arya.bookmanagerjpa.controllers;

import com.arya.bookmanagerjpa.domain.dtos.AuthorDto;
import com.arya.bookmanagerjpa.domain.entities.Author;
import com.arya.bookmanagerjpa.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/author")
public class AuthorController {
    AuthorService authorService;
    public AuthorController(AuthorService authorService){
        this.authorService=authorService;
    }
    @PostMapping
   public ResponseEntity<AuthorDto>SaveController(@RequestBody AuthorDto authorDto) {
        Author author = new Author(null, authorDto.getAge(), authorDto.getName());
        Author saved = authorService.save(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(new AuthorDto(saved.getName(), saved.getAge()));
    }
}


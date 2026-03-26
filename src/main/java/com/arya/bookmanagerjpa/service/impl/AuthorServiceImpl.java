package com.arya.bookmanagerjpa.service.impl;

import com.arya.bookmanagerjpa.domain.entities.Author;
import com.arya.bookmanagerjpa.repository.AuthorRepository;
import com.arya.bookmanagerjpa.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;
    public AuthorServiceImpl (AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }
}

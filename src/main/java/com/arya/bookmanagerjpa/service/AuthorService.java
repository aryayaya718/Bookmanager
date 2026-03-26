package com.arya.bookmanagerjpa.service;

import com.arya.bookmanagerjpa.domain.entities.Author;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    Author save(Author author);
}

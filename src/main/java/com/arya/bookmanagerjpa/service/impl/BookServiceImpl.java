package com.arya.bookmanagerjpa.service.impl;

import com.arya.bookmanagerjpa.domain.entities.Book;
import com.arya.bookmanagerjpa.repository.BookRepository;
import com.arya.bookmanagerjpa.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

BookRepository bookRepository;
public BookServiceImpl (BookRepository bookRepository){
    this.bookRepository=bookRepository;
}
    @Override
    public Book save (Book book){
    return bookRepository.save(book);
    }

}

package com.arya.bookmanagerjpa.controllers;

import com.arya.bookmanagerjpa.domain.dtos.BookDto;
import com.arya.bookmanagerjpa.domain.entities.Book;
import com.arya.bookmanagerjpa.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/book")
public class BookController {
    BookService bookService;
    public BookController (BookService bookService){
        this.bookService=bookService;
    }
    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){
        Book book=new Book(bookDto.getIsbn(),bookDto.getAuthor(),bookDto.getTitle());
        Book savedBook=bookService.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(new BookDto(savedBook.getIsbn(),savedBook.getAuthor(),savedBook.getTitle()));
    }
}

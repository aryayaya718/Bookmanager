package com.arya.bookmanagerjpa.repository;

import com.arya.bookmanagerjpa.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}

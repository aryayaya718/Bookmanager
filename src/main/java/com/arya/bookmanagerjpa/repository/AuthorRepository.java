package com.arya.bookmanagerjpa.repository;

import com.arya.bookmanagerjpa.domain.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}

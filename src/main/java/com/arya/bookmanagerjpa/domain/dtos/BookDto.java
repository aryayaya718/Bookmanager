package com.arya.bookmanagerjpa.domain.dtos;

import com.arya.bookmanagerjpa.domain.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    String isbn;
    Author author;
    String title;
}

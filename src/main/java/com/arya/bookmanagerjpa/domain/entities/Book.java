package com.arya.bookmanagerjpa.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    private String isbn;
    @ManyToOne (cascade={CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="author_id")
    private Author author;
    @Column(nullable = false)
    private String title;
}

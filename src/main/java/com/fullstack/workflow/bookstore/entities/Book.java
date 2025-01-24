package com.fullstack.workflow.bookstore.entities;

import com.fullstack.workflow.bookstore.data.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;

import java.util.UUID;

@Entity
@Table(name = "book",schema = "public")
public class Book {
    @Id private UUID id;
    private  String name;
    private  String author;
    private Genre genre;
}

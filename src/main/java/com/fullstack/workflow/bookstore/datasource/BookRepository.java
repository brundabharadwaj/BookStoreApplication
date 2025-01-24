package com.fullstack.workflow.bookstore.datasource;

import com.fullstack.workflow.bookstore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}

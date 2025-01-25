package com.fullstack.workflow.bookstore.service;

import com.fullstack.workflow.bookstore.datasource.BookRepository;
import com.fullstack.workflow.bookstore.dto.BookDto;
import com.fullstack.workflow.bookstore.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {
    @Autowired private BookRepository bookRepository;
    public Book addBooksToTheStore(BookDto book){
        Book bookEntity =transformDtoToEntity(book);
      return  bookRepository.save(bookEntity);
    }

    private Book transformDtoToEntity(BookDto bookDto) {
        return  Book.builder().author(bookDto.author())
                .name(bookDto.title()).genre(bookDto.genre()).build();
    }

}

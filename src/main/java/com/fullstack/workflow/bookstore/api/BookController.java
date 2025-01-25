package com.fullstack.workflow.bookstore.api;

import com.fullstack.workflow.bookstore.data.Genre;
import com.fullstack.workflow.bookstore.dto.BookDto;
import com.fullstack.workflow.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired private BookStoreService service;

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        BookDto myBook = new BookDto("You are Awesome", UUID.randomUUID(),"Brunda Bharadwaj", Genre.BIOGRAPHY);
        return new ResponseEntity<>(List.of(myBook), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody BookDto bookDetails){
       service.addBooksToTheStore(bookDetails);
       return new ResponseEntity<>(HttpStatus.OK);
    }

}

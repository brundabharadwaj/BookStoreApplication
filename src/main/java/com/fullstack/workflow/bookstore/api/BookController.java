package com.fullstack.workflow.bookstore.api;

import com.fullstack.workflow.bookstore.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        BookDto myBook = new BookDto("You are Awesome", UUID.randomUUID(),"Brunda Bharadwaj ");
        return new ResponseEntity<>(List.of(myBook), HttpStatus.OK);
    }

}

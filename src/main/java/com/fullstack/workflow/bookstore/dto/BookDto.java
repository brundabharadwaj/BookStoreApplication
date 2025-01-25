package com.fullstack.workflow.bookstore.dto;


import com.fullstack.workflow.bookstore.data.Genre;

import java.util.UUID;

public  record BookDto(
        String title,
        UUID serialNumber,
        String author,
        Genre genre
){

}


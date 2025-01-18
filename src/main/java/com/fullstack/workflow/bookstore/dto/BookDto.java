package com.fullstack.workflow.bookstore.dto;


import java.util.UUID;

public  record BookDto(
        String title,
        UUID serialNumber,
        String Author
){

}


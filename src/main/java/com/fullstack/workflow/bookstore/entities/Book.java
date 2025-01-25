package com.fullstack.workflow.bookstore.entities;

import com.fullstack.workflow.bookstore.data.Genre;
import jakarta.persistence.*;
import lombok.*;


import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book",schema = "public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private  String name;
    private  String author;
    private Genre genre;
}

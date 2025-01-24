package com.fullstack.workflow.bookstore.data;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;


public enum Genre {

    FICTION("Fictional genre, including novels and stories"),
    NON_FICTION("Non-fictional, factual content"),
    FANTASY("Magical worlds and fantastical elements"),
    MYSTERY("Suspense and crime-solving themes"),
    SCIENCE_FICTION("Futuristic and scientific ideas"),
    BIOGRAPHY("Life stories of real people"),
    HORROR("Scary, thrilling, and chilling tales");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


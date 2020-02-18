package com.yoandypv.cloud.msbooks.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Value("${books.welcome.message}")
    private String welcomeMessage;

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/books")
    public ResponseEntity<String > postBook() {
        logger.info("Request done");
        return new ResponseEntity<>(welcomeMessage, HttpStatus.OK);
    }

}

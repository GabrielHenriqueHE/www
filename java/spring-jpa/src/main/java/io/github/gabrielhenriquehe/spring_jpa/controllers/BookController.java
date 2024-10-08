package io.github.gabrielhenriquehe.spring_jpa.controllers;

import io.github.gabrielhenriquehe.spring_jpa.dto.BookRecordDTO;
import io.github.gabrielhenriquehe.spring_jpa.models.BookModel;
import io.github.gabrielhenriquehe.spring_jpa.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bookstore/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookModel> saveBook(@RequestBody BookRecordDTO bookRecordDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(bookRecordDTO));
    }

    @GetMapping("/{title}")
    public ResponseEntity<BookModel> getBookByTitle (@PathVariable("title") String title) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findBookModelByTitle(title.replace("+", " ")));
    }

    @GetMapping
    public ResponseEntity<List<BookModel>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable UUID id) {
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK).body("Book deleted successfully");
    }

}

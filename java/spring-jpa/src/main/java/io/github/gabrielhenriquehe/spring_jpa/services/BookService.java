package io.github.gabrielhenriquehe.spring_jpa.services;

import io.github.gabrielhenriquehe.spring_jpa.dto.BookRecordDTO;

import io.github.gabrielhenriquehe.spring_jpa.models.BookModel;
import io.github.gabrielhenriquehe.spring_jpa.models.ReviewModel;

import io.github.gabrielhenriquehe.spring_jpa.repositories.AuthorRepository;
import io.github.gabrielhenriquehe.spring_jpa.repositories.BookRepository;
import io.github.gabrielhenriquehe.spring_jpa.repositories.PublisherRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public BookModel saveBook(BookRecordDTO bookRecordDTO) {
        BookModel book = new BookModel();
        book.setTitle(bookRecordDTO.title());
        book.setPublisher(publisherRepository.findById(bookRecordDTO.publisherId()).get());
        book.setAuthors(authorRepository.findAllById(bookRecordDTO.authorIds()).stream().collect(Collectors.toSet()));

        ReviewModel review = new ReviewModel();
        review.setComment(bookRecordDTO.reviewComment());
        review.setBook(book);
        book.setReview(review);

        return bookRepository.save(book);
    }

    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    public BookModel findBookModelByTitle(String title) {
        return bookRepository.findBookModelByTitle(title);
    }

    @Transactional
    public void deleteBook(UUID id) {
        bookRepository.deleteById(id);
    }
}

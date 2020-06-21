package dev.istvan.springframework.springwebapp.repositories;

import dev.istvan.springframework.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

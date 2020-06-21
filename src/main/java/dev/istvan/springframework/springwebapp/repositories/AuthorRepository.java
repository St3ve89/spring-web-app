package dev.istvan.springframework.springwebapp.repositories;


import dev.istvan.springframework.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

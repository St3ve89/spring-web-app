package dev.istvan.springframework.springwebapp.repositories;

import dev.istvan.springframework.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

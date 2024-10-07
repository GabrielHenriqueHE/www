package io.github.gabrielhenriquehe.spring_jpa.repositories;

import io.github.gabrielhenriquehe.spring_jpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
    PublisherModel findPublisherByName(String name);
}

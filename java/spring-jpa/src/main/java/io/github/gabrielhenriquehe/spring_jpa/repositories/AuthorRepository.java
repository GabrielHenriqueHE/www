package io.github.gabrielhenriquehe.spring_jpa.repositories;

import io.github.gabrielhenriquehe.spring_jpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
    AuthorModel findAuthorModelByName(String name);
}

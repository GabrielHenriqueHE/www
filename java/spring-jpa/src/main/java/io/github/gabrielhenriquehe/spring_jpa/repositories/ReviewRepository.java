package io.github.gabrielhenriquehe.spring_jpa.repositories;

import io.github.gabrielhenriquehe.spring_jpa.models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {

}

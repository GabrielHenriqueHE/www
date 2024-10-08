package io.github.gabrielhenriquehe.spring_jpa.dto;

import java.util.Set;
import java.util.UUID;

public record BookRecordDTO(String title, UUID publisherId, Set<UUID> authorIds, String reviewComment) {
}

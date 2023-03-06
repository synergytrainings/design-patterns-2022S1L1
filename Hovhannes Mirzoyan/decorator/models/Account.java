package patterns.decorator.models;

import java.time.LocalDateTime;

public record Account(String email, String firstName, String lastName, String location,
                      LocalDateTime createdDate, LocalDateTime updatedDate) {
}

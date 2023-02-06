package dev.rahul.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("reviews")
public class Review {

    private ObjectId id;
    private String reviewBody;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String reviewBody, LocalDateTime created, LocalDateTime updated) {
        this.reviewBody = reviewBody;
        this.created = created;
        this.updated = updated;
    }
}

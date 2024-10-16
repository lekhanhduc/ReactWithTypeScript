package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "reviews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Review extends AbstractEntity<Long>{

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "rating")
    double rating;

    @Column(name = "review_description")
    String reviewDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id", nullable = false)
    Book book;
}

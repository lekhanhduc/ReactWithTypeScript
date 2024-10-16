package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book extends AbstractEntity<Long>{

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "author", nullable = false)
    String author;

    @Column(name = "description")
    String description;

    @Column(name = "copies")
    Integer copies; // tổng số bản sao của sách

    @Column(name = "copies_available")
    Integer copiesAvailable; // số lượng sách hiện tại còn sẵn để sử dụng

    @Column(name = "category")
    String category;

    @Column(name = "img")
    String img;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    List<Review> reviews;
}

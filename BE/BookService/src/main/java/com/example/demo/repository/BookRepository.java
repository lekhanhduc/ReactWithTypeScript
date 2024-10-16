package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findByTitleIgnoreCase (String title, Pageable pageable);
    Page<Book> findByCategoryIgnoreCase (String category, Pageable pageable);
}

package com.example.demo.service;

import com.example.demo.exception.AppException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.repository.BookRepository;
import com.example.demo.dto.response.BookResponse;
import com.example.demo.dto.response.PaginationResponse;
import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.example.demo.utils.PaginationUtils.*;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookService {

    BookRepository bookRepository;
    BookMapper bookMapper;

    public PaginationResponse<BookResponse> fetchAllBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page - 1 , size);
        Page<Book> books = bookRepository.findAll(pageable);

        return buildPaginationResponse(books, page, size, bookMapper::toBookResponse);
    }

    public PaginationResponse<BookResponse> fetchBookByTitle(String title, int page, int size){
        Pageable pageable = PageRequest.of(page - 1 , size);
        Page<Book> booksByTitle = bookRepository.findByTitleIgnoreCase(title, pageable);

        return buildPaginationResponse(booksByTitle, page, size, bookMapper::toBookResponse);
    }

    public PaginationResponse<BookResponse> fetchBookByCategory(String category, int page, int size){
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Book> bookByCategory = bookRepository.findByCategoryIgnoreCase(category, pageable);

        return buildPaginationResponse(bookByCategory, page, size, bookMapper::toBookResponse);
    }

    public List<String> fetchAllCategory () {
        List<Book> categories = bookRepository.findAll();

        return categories.stream().map(Book::getCategory)
                .distinct()
                .toList();
    }

    public BookResponse fetchBookById (Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.BOOK_NOT_EXISTED));

        return bookMapper.toBookResponse(book);
    }

}

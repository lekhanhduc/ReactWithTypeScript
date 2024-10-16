package com.example.demo.controller;

import com.example.demo.dto.response.BookResponse;
import com.example.demo.dto.response.PaginationResponse;
import com.example.demo.dto.response.ResponseData;
import com.example.demo.service.BookService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookController {

    BookService bookService;

    @GetMapping("/books")
    ResponseData<PaginationResponse<BookResponse>> fetchAllBooks(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                                 @RequestParam(value = "size", required = false, defaultValue = "6") int size) {
        return ResponseData.<PaginationResponse<BookResponse>>builder()
                .code(HttpStatus.OK.value())
                .result(bookService.fetchAllBooks(page, size))
                .build();
    }

    @GetMapping("/fetch-book-by-title")
    ResponseData<PaginationResponse<BookResponse>> fetchBooksByTitle(@RequestParam(value = "title", required = false, defaultValue = "") String title,
                                                                     @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                                     @RequestParam(value = "size", required = false, defaultValue = "6") int size) {

        return ResponseData.<PaginationResponse<BookResponse>>builder()
                .code(HttpStatus.OK.value())
                .result(bookService.fetchBookByTitle(title, page, size))
                .build();
    }

    @GetMapping("/fetch-book-by-category")
    ResponseData<PaginationResponse<BookResponse>> fetchBookByCategory(@RequestParam(value = "category", required = false, defaultValue = "") String category,
                                                                       @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                                       @RequestParam(value = "size", required = false, defaultValue = "6") int size) {

        return ResponseData.<PaginationResponse<BookResponse>>builder()
                .code(HttpStatus.OK.value())
                .result(bookService.fetchBookByCategory(category, page, size))
                .build();
    }

    @GetMapping("/fetch-all-category")
    ResponseData<List<String>> fetchAllCategory(){
        return ResponseData.<List<String>>builder()
                .code(HttpStatus.OK.value())
                .result(bookService.fetchAllCategory())
                .build();
    }

    @GetMapping("/book/{id}")
    ResponseData<BookResponse> fetchBookById(@PathVariable Long id) {
        return ResponseData.<BookResponse>builder()
                .code(HttpStatus.OK.value())
                .result(bookService.fetchBookById(id))
                .build();
    }

}

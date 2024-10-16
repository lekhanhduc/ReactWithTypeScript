package com.example.demo.mapper;

import com.example.demo.dto.response.BookResponse;
import com.example.demo.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookResponse toBookResponse (Book book);
}

package com.example.demo.utils;

import com.example.demo.dto.response.PaginationResponse;
import org.springframework.data.domain.Page;
import java.util.function.Function;

public class PaginationUtils {
    private PaginationUtils() {
    }

    public static <T,E> PaginationResponse<T> buildPaginationResponse (Page<E> entity,
                                                                       int page, int size,
                                                                       Function<E, T> mapper) {

        return PaginationResponse.<T>builder()
                .currentPage(page)
                .pageSize(size)
                .totalPages(entity.getTotalPages())
                .totalElements(entity.getTotalElements())
                .data(entity.getContent().stream().map(mapper).toList())
                .build();
    }

}

package com.example.demo.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Collections;
import java.util.List;

@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaginationResponse<T> {

    int currentPage;
    int totalPages;
    int pageSize;
    long totalElements;

    @Builder.Default
    List<T> data = Collections.emptyList();
}

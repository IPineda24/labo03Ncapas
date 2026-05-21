package org.example.labo03.domain.dto.response;

import lombok.*;
import java.util.List;

@Data
@Builder
public class PageableResponse {
    private List<?> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean isLast;
}
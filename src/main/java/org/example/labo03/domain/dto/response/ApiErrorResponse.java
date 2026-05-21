package org.example.labo03.domain.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
public class ApiErrorResponse {
    private String message;
    private int status;
    private LocalDateTime time;
    private String uri;
}
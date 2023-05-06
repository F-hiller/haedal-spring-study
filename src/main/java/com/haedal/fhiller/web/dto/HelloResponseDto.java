package com.haedal.fhiller.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// HelloController에서 사용되는 HelloResponseDto
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}

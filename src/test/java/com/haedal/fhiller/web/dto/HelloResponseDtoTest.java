package com.haedal.fhiller.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloResponseDtoTest {

    // 롬복의 Getter 기능이 제대로 작동하는지 확인하는 테스트
    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
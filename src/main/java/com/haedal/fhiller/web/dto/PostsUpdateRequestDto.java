package com.haedal.fhiller.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// PostsApiController에서 Posts의 정보를 수정하기 위한 과정에서 필요한 Dto
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

}

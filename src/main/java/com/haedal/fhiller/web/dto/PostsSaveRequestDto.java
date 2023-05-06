package com.haedal.fhiller.web.dto;

import com.haedal.fhiller.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// PostsApiController에서 Posts의 정보를 저장하기 위한 과정에서 필요한 Dto
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // DB에 저장되어야하므로 Entity로 변환해주는 함수가 필요하다.
    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .author(author)
                .content(content)
                .build();
    }

}

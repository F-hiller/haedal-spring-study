package com.haedal.fhiller.web.dto;

import com.haedal.fhiller.domain.posts.Posts;
import lombok.Getter;

// PostsApiController에서 Posts의 정보를 다룰 수 있는 Dto
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}

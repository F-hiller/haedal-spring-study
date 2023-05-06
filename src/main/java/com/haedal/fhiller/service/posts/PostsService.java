package com.haedal.fhiller.service.posts;

import com.haedal.fhiller.domain.posts.Posts;
import com.haedal.fhiller.domain.posts.PostsRepository;
import com.haedal.fhiller.web.dto.PostsResponseDto;
import com.haedal.fhiller.web.dto.PostsSaveRequestDto;
import com.haedal.fhiller.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
// Posts Repository와 PostsApiController 사이의 정보 교환을 처리하는 로직을 담당하는 PostsService.
public class PostsService {
    private final PostsRepository postsRepository;

    // 정보를 저장
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    // 정보를 수정
    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    // 정보를 검색
    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }


}
